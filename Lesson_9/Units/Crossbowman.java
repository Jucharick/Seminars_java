package Lesson_9.Units;

public class Crossbowman extends ShooterClass{
     
    public Crossbowman (String name) {
        super(50, 6, 7, 56, name);
    }

    @Override
    public void getInfo() {
        System.out.printf("Crossbowman Hero  Hp: %d  Speed: %d  Damage: %d  Arrows: %d \n",
                        this.hp, this.speed, this.damage, this.arrows);
    }

    @Override
    public String toString() {
        return "Crossbowman";
    }

}