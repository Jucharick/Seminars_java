package Lesson_7.Units;

public class ShooterClass extends BaseHero{
    protected int arrows;

    public ShooterClass(float hp, int speed, int damage, int arrows) {
        super(hp, speed, damage);
        this.arrows = arrows;
    }

    @Override
    public String toString() {
        return String.format("Type: %s  Hp: %f  Speed: %d  Damage: %d  Arrows: %d",
                            this.getClass().getSimpleName(), this.hp, this.speed, this.damage, this.arrows);
    }
    
}