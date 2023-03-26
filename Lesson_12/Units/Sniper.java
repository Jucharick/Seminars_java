package Lesson_12.Units;

public class Sniper extends ShooterClass {


    public Sniper(String name, int x, int y) {
        super("Sniper", 40, 5, 9, 20, 21, name, x, y);
    }

    @Override
    public String getName() {
        return "Sniper";
    }

}