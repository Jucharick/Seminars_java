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
            if(this.position.getDistance(target)>=2){
                this.position.direction(target.position, friends);
            }
            else if(target.hp > 0){
                this.attack(friends);
                this.arrows--;
            }
        }
    }
}