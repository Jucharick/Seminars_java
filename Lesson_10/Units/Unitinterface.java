package Lesson_10.Units;

import java.util.ArrayList;

// в java 7 не предполагаются модификаторы видимости, все интерфейсы публичные

public interface Unitinterface {
    void step(ArrayList<BaseHero> team);
    void getInfo();
    String toString();
}
