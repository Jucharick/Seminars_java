package Lesson_10.Units;

public class Sniper extends ShooterClass{
    public Sniper(String name) {
        super(40, 5, 9, 21, name);
    }

    @Override
    public void getInfo() {
        System.out.printf("Sniper Hero  Hp: %d  Speed: %d  Damage: %f  Arrows: %d \n",
                        this.hp, this.speed, this.damage, this.arrows);
    }

    @Override
    public String toString() {
        return "Sniper";
    }

}