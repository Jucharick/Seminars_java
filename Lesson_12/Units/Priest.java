package Lesson_12.Units;

public class Priest extends MagClass{

    public Priest(String name, int x, int y) {
        super("Priest",30, 3, 15, 18, 50, 10, name, x, y);
    }

    @Override
    public String getName() {
        return "Priest";
    }

}
