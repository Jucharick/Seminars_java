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
        if (this.arrows!= 0 && this.hp > 0){

            damage = ShooterClass.r.nextFloat(this.damage, this.maxDamage);
            BaseHero nearestUnit = minDistance(team);
                
            if (nearestUnit.hp > 0 && !nearestUnit.state.equals("die")) {
                nearestUnit.loseDamage(damage);
                this.arrows--;
            }
        }
    }
}