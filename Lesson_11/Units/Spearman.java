package Lesson_11.Units;

public class Spearman extends ShooterClass{

    public Spearman(String name, int x, int y) {
        super(40, 6, 6, 35, name, x, y);
    }

    @Override
    public void getInfo() {
        System.out.printf("Spearman Hero  Hp: %d  Speed: %d  Damage: %f  Arrows: %d  Position(%d, %d) \n",
                        this.hp, this.speed, this.damage, this.arrows, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Spearman";
    }

}
