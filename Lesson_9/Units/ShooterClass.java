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


    
    // public void LossArrows(int arrows) {
    //     if (this.arrows - 1 > 0) {
    //         this.arrows -= 1;
    //     }
    // }

    // public void ShooterAttack(ShooterClass attackUnit, BaseHero unit) {
    //     System.out.printf("%s атакует %s\n", attackUnit.getClass().getSimpleName(), unit.getClass().getSimpleName());
    //     attackUnit.LossArrows(arrows);
    //     if (arrows != 0){
    //         damage = ShooterClass.r.nextInt(2, 6);
    //         unit.GetDamage(damage);
    //         System.out.printf("%s теряет %d hp\n", unit.getClass().getSimpleName(), damage);
    //     }
    //     else {
    //         System.out.println("Урон не нанесен");
    //     }
    // }
}