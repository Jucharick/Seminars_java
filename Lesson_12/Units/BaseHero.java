package Lesson_12.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Unitinterface { // собирается для всех объектов

    protected static Random r;
    static {
        BaseHero.r = new Random();
    }

    protected String type;
    public int hp; // protected видно только в пакете Units
    protected int maxHp;
    protected int speed;
    protected float damage;
    protected float maxDamage;
    protected final String NAME; // константа, final - один раз ее установив изменить нельзя, она не изменяема
                                 // если поставить static, то имя у всех было бы одно
    protected String state;
    protected Position position;

    public void getNAME() {
        System.out.println(NAME);
    }

    public BaseHero(String type, int hp, int speed, float damage, float maxDamage, String name, int x, int y) {
        this.type = type;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.maxDamage = maxDamage;
        NAME = name;
        state = "Stand"; // стоит, ничего не делает
        position = new Position(x, y);
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public Position getPosition() {
        return position;
    }

    public String getType() {
        return type;
    }

    public float getDamage() {
        return damage;
    }

    public String getState() {
        return state;
    }

    @Override // @Override - аннотация
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
        System.out.println("");// заглушка
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t damage %-3f\t helth %-3d%% ", type, damage,(int) hp * 100 / maxHp);
        return outStr;
    }


    @Override
    public String toString() {
        return "Damage: " + getDamage() + ", HP: " + getHp() + ", Speed: " + getSpeed();
    }

    @Override
    public String getName() {
        return "";
    }

    public BaseHero minDistance(ArrayList<BaseHero> team) {
        BaseHero nearestUnit = team.get(0);
        double minDist = position.getDistance(team.get(0));
        for (BaseHero unit : team) {
            double dist = position.getDistance(unit);
            if (dist < minDist) {
                nearestUnit = unit;
                minDist = dist;
            }
        }
        return nearestUnit;
    }

    public void attack(ArrayList<BaseHero> team) {
        float damage = BaseHero.r.nextFloat(this.damage, this.maxDamage);
        BaseHero nearestUnit = minDistance(team);

        if (nearestUnit.hp > 0 && !nearestUnit.state.equals("die")) {
            nearestUnit.loseDamage(damage);
        }
    }

    public void loseDamage(float damage) {
        if (this.hp - damage >= 0) {
            this.hp -= damage;
        } else {
            this.hp = 0;
            this.state = "die";
        }
    }

}
