package Lesson_12.Units;


public class Crossbowman extends ShooterClass{
     
    public Crossbowman (String name, int x, int y) {
        super("Crossbowman", 50, 6, 7, 15, 56, name, x, y);
    }

    @Override
    public String getName() {
        return "Crossbowman";
    }

}