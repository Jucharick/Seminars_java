package Lesson_9.Units;

public class Spearman extends ShooterClass{

    public Spearman(String name) {
        super(40, 6, 6, 35, name);
    }

    @Override
    public void getInfo() {
        System.out.printf("Spearman Hero  Hp: %d  Speed: %d  Damage: %d  Arrows: %d \n",
                        this.hp, this.speed, this.damage, this.arrows);
    }

    @Override
    public String toString() {
        return "Spearman";
    }

}
