package Lesson_12.Units;

import java.util.ArrayList;

public abstract class ManClass extends BaseHero {
    protected int poisons;
    protected int dexterity;
    protected int stamina;

    public ManClass(String type, int hp, int speed, float damage, float maxDamage,  int stamina, int poisons, int dexterity, String name, int x, int y) {
        super(type, hp, speed, damage, maxDamage, name, x, y);
        this.poisons = poisons;
        this.dexterity = dexterity;
        this.stamina = stamina;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends){
        if (this.stamina > 0 && this.hp > 0) {
    
            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BaseHero unit : team) {
                if(this.position.getDistance(unit)<minDistance && unit.hp>0){
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }
            if(this.position.getDistance(target)>=2){
                this.position.direction(target.position, friends);
            }
            else if(target.hp > 0){
                this.attack(friends);
                this.stamina--;
            }
        }
    }

}
