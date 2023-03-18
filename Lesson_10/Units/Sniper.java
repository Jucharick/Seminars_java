package Lesson_10.Units;

public class Sniper extends ShooterClass {


    public Sniper(String name, int x, int y) {
        super(40, 5, 9, 21, name, x, y);
    }

    @Override
    public void getInfo() {
        System.out.printf("Sniper Hero  Hp: %d  Speed: %d  Damage: %f  Arrows: %d  Position(%d, %d) \n",
                        this.hp, this.speed, this.damage, this.arrows, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Sniper";
    }


}