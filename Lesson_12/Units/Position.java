package Lesson_12.Units;

import java.util.ArrayList;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Position position) {
        if ((position.x == this.x) & (position.y == this.y))
            return true;
        else
            return false;
    }

    public double getDistance(BaseHero unit) {
        return (Math.sqrt(Math.pow(this.x - unit.position.x, 2)) + Math.pow(this.y - unit.position.y, 2));
    }

    public void direction(Position position, ArrayList<BaseHero> friends) {
        boolean[] temp = checkPos(friends);
        float dx = Math.abs(this.x - position.x);
        float dy = Math.abs(this.y - position.y);
        if ((dx > dy)) {
            if (this.x < position.x && !temp[0] && this.x + 1 != 11) {
                this.x += 1;
                return;
            } else if (this.x > position.x && !temp[1] && this.x - 1 != 0) {
                this.x -= 1;
                return;
            }
            if (this.y <= position.y && !temp[2] && this.y + 1 != 11) {
                this.y += 1;
                return;
            } else if (this.y >= position.y && !temp[3] && this.y - 1 != 0) {
                this.y -= 1;
                return;
            }
        } else {
            if (this.y < position.y && !temp[2] && this.y + 1 != 11) {
                this.y += 1;
                return;
            } else if (this.y > position.y && !temp[3] && this.x - 1 != 0) {
                this.y -= 1;
                return;
            }
            if (this.x <= position.x && !temp[0] && this.x + 1 != 11) {
                this.x += 1;
                return;
            } else if (this.x >= position.x && !temp[1] && this.x - 1 != 0) {
                this.x -= 1;
                return;
            }
        }
    }

    public boolean[] checkPos(ArrayList<BaseHero> friends) {
        boolean[] temp = new boolean[4];
        for (BaseHero u : friends) {
            if ((u.position.x == this.x + 1) && (u.position.y == this.y))
                temp[0] = true;
            if ((u.position.x == this.x - 1) && (u.position.y == this.y))
                temp[1] = true;
            if ((u.position.x == this.x) && (u.position.y == this.y + 1))
                temp[2] = true;
            if ((u.position.x == this.x) && (u.position.y == this.y - 1))
                temp[3] = true;
        }
        return temp;
    }

}
