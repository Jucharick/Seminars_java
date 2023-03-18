package Lesson_10.Units;


import java.util.ArrayList;
import java.util.Random;

public abstract class ShooterClass extends BaseHero{
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(int hp, int speed, float damage, int arrows, String name) {
        super(hp, speed, damage, name);
        this.arrows = arrows;
    }

    @Override 
    public void attack(BaseHero unit) {
        if (this.arrows!= 0 && unit.hp > 0){
            damage = ShooterClass.r.nextInt(10, 16);
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

    @Override
    public void step(ArrayList<BaseHero> team) {
        if (!state.equals("Die") && arrows == 0) return;
        // выстрел
    }

}