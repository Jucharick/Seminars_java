package Lesson_9.Units;


import java.util.Random;

public abstract class ShooterClass extends BaseHero{
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(float hp, int speed, int damage, int arrows, String name) {
        super(hp, speed, damage, name);
        this.arrows = arrows;
    }

    @Override
    public void getInfo() {
        System.out.printf("Type: %s  Hp: %f  Speed: %d  Damage: %d  Arrows: %d \n",
        this.getClass().getSimpleName(), this.hp, this.speed, this.damage, this.arrows);
    }

    // this.getClass().getSimpleName() - очень медлено
    
}