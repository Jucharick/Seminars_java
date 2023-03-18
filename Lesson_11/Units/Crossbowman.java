package Lesson_11.Units;


public class Crossbowman extends ShooterClass{
     
    public Crossbowman (String name, int x, int y) {
        super(50, 6, 7, 56, name, x, y);
    }

    @Override
    public void getInfo() {
        System.out.printf("Crossbowman Hero  Hp: %d  Speed: %d  Damage: %f  Arrows: %d  Position(%d, %d) \n",
                        this.hp, this.speed, this.damage, this.arrows, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Crossbowman";
    }

}