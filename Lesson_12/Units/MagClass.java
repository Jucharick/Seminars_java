package Lesson_12.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class MagClass extends BaseHero {
    protected int mana;
    protected int elixir;
    protected static Random r;

    static {
        MagClass.r = new Random();
    }

    public MagClass(String type, int hp, int speed, float damage, float maxDamage, int mana, int elixir, String name,
            int x, int y) {
        super(type, hp, speed, damage, maxDamage, name, x, y);
        this.mana = mana;
        this.elixir = elixir;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {

        if (this.mana != 0 && this.hp > 0) {

            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BaseHero unit : team) {
                if (this.position.getDistance(unit) < minDistance && unit.hp > 0) {
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }
            if (this.position.getDistance(target) >= 2) {
                this.position.direction(target.position, friends);
            } else if (target.hp > 0) {
                this.attack(friends);
                this.mana--;
            }

            if (this.elixir != 0) {
                BaseHero helpFriend = minDistance(team);
                if (helpFriend.hp < helpFriend.maxHp / 2) {
                    helpFriend.hp = helpFriend.maxHp;
                    this.elixir--;
                }
            }
        }
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t damage %-3f\t helth %-3d%%\t mana %d \t elixir %d ", type, damage, (int) hp * 100 / maxHp, mana, elixir);
        return outStr;
    }

}
