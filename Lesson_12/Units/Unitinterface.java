package Lesson_12.Units;

import java.util.ArrayList;

// в java 7 не предполагаются модификаторы видимости, все интерфейсы публичные

public interface Unitinterface {
    void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends);
    String getInfo();
    String toString();
    String getName();
}
