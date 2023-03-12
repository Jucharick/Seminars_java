package Lesson_9.Units;

import java.util.ArrayList;

// в java 7 не предполагаются модификаторы видимости, все интерфейсы публичные

public interface Unitinterface {
    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    void getInfo();
    String toString();
}
