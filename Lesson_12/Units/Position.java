package Lesson_12.Units;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Position opposit) {
        if (opposit.y == this.y && opposit.x == this.x) return true;
        return false;
    }

    public double getDistance (BaseHero unit) {
        return (Math.sqrt(Math.pow(this.x-unit.position.x, 2)) + Math.pow(this.y-unit.position.y, 2));
    }

}
