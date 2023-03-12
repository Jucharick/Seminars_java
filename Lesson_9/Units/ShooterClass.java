package Lesson_9.Units;


import java.util.ArrayList;
import java.util.Random;

public abstract class ShooterClass extends BaseHero{
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(int hp, int speed, int damage, int arrows, String name) {
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
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (this.arrows > 0 && this.hp > 0) {
            System.out.printf("%s могу атаковать!  ", this.toString());
            for (BaseHero unit: team2) {
                if (unit.hp > 0) {
                    System.out.printf("%s атакует %s.  ", this.toString(), unit.toString());
                    this.attack(unit);
                    this.getInfo();
                    this.arrows--;
                    this.getInfo();
                    break;
                }
            }
        }
        for (BaseHero unit: team1) {
            if (unit.toString().equals("Peasant")) {
                this.getInfo();
                this.arrows++;
                this.getInfo();
                break;
            }
        }
    }

}