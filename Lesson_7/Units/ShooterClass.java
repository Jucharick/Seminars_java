package Lesson_7.Units;


import java.util.Random;


public class ShooterClass extends BaseHero{
    protected int arrows;
    protected static Random r;

    static {
        ShooterClass.r = new Random();
    }

    public ShooterClass(float hp, int speed, int damage, int arrows) {
        super(hp, speed, damage);
        this.arrows = arrows;
    }

    @Override
    public String toString() {
        return String.format("Type: %s  Hp: %f  Speed: %d  Damage: %d  Arrows: %d",
                            this.getClass().getSimpleName(), this.hp, this.speed, this.damage, this.arrows);
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void LossArrows(int arrows) {
        if (this.arrows - arrows > 0) {
            this.arrows -= arrows;
        }
    }

    public void ShooterAttack(ShooterClass target) {
        // как обратиться к герою, который наносит урон?
        if (arrows != 0){
            damage = ShooterClass.r.nextInt(2, 6);
            target.GetDamage(damage);
            System.out.printf("%s теряет %d hp\n", target.getClass().getSimpleName(), damage);
        }
    }
}