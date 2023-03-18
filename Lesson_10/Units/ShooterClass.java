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
            System.out.println("can shot!");
            damage = ShooterClass.r.nextInt(10, 16);
            for (BaseHero unit : team) {
                // double minDist = distance(this.x, this.y, unit.x, unit.y);
                if (unit.hp - damage > 0) {
                    unit.loseDamage(damage);
                    System.out.printf("%s теряет %d hp.\n", unit.toString(), damage);
                    unit.getInfo();
                }
                else {
                    System.out.printf("%s убит.\n", unit.toString());
                } 
            }
            
        }
    }

}