package Lesson_11.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class ShooterClass extends BaseHero {
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(String type, int hp, int speed, float damage, int arrows, String name, int x, int y) {
        super(type, hp, speed, damage, name, x, y);
        this.arrows = arrows;
    }

    
    @Override
    public void step(ArrayList<BaseHero> team)  {
        if (this.arrows!= 0 && this.hp > 0){

            damage = ShooterClass.r.nextInt(14, 20);
            BaseHero nearestUnit = minDistance(team);
                
            if (nearestUnit.hp > 0 && !nearestUnit.state.equals("die")) {
                nearestUnit.loseDamage(damage);
                this.arrows--;
            }
        }
    }
}