package Lesson_12.Units;

public class Peasant extends ManClass {

    public Peasant(String name, int x, int y) {
        super("Peasant",40, 7, 3, 0, 2, name, x, y);
    }

    @Override
    public String getName() {
        return "Peasant";
    }

}