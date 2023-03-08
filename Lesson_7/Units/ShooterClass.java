package Lesson_7.Units;

public class ShooterClass extends BaseHero{
    protected int arrows;

    public ShooterClass(float hp, int speed, int damage, int arrows) {
        super(hp, speed, damage);
        this.arrows = arrows;
    }
}