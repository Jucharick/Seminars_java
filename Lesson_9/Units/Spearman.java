package Lesson_9.Units;

public class Spearman extends ShooterClass{

    public Spearman(String name) {
        super(40, 6, 6, 35, name);
    }

    @Override
    public void step() {
        System.out.println("Копейщик бросил копьё!");
    }
}
