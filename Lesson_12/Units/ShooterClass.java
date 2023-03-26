package Lesson_12.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class ShooterClass extends BaseHero {
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(String type, int hp, int speed, float damage, float maxDamage, int arrows, String name, int x, int y) {
        super(type, hp, speed, damage, maxDamage, name, x, y);
        this.arrows = arrows;
    }

    
    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends)  {

        if (this.arrows!= 0 && this.hp > 0) {
    
            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BaseHero unit : team) {
                if(this.position.getDistance(unit)<minDistance && unit.hp>0){
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }
            if(target.hp > 0){
                this.attack(friends);
                this.arrows--;
            }
        }

        for (BaseHero unit : friends) {
            if (unit instanceof Peasant) {      //unit.getName().equals("Peasant")
                this.arrows++;
                break;
            }
        }
    }


    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t damage %-3f\t helth %-3d%%\t arrows %d ", type, damage, (int) hp * 100 / maxHp, arrows);
        return outStr;
    }
}