package Lesson_12.Units;

public class Magician extends MagClass {

    public Magician(String name, int x, int y) {
        super("Magician",35, 4, 12, 45, 1, name, x, y);
    }  

    @Override
    public String getName() {
        return "Magician";
    }

}