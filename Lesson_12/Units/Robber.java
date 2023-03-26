package Lesson_12.Units;

public class Robber extends ManClass {

    public Robber(String name, int x, int y) {
        super("Robber",40, 7, 1, 4, 30, 3, 7, name, x, y);
    }

    @Override
    public String getName() {
        return "Robber";
    }

}