package Lesson_8.Units;

public class Spearman extends ShooterClass{

    public Spearman() {
        super(40, 6, 6, 35);
    }

    @Override
    public void step() {
        System.out.println("Копейщик бросил копьё!");
    }
}
