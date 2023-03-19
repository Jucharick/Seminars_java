package Lesson_11.Units;

public class Spearman extends ShooterClass{

    public Spearman(String name, int x, int y) {
        super("Spearman",40, 6, 6, 35, name, x, y);
    }

    @Override
    public String getName() {
        return "Spearman";
    }

}
