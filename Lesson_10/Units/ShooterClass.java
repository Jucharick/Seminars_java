package Lesson_10.Units;


import java.util.ArrayList;
import java.util.Random;

public abstract class ShooterClass extends BaseHero {
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(int hp, int speed, float damage, int arrows, String name, int x, int y) {
        super(hp, speed, damage, name, x, y);
        this.arrows = arrows;
    }

    
    @Override
    public void step(ArrayList<BaseHero> team)  {
        if (this.arrows!= 0 && this.hp > 0){
            System.out.printf("%s can shot! ", this.toString());

            damage = ShooterClass.r.nextInt(2, 11);
            BaseHero nearestUnit = minDistance(team);
                
            if (nearestUnit.hp > 0 && !nearestUnit.state.equals("die")) {
                nearestUnit.loseDamage(damage);
                System.out.printf("%s теряет %f hp.\n", nearestUnit.toString(), damage);
                nearestUnit.getInfo();
                this.arrows--;
                this.getInfo();
            }
            else {
                System.out.printf("%s убит.\n", nearestUnit.toString());
            } 
        }
    }
}