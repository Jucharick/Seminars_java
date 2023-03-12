package Lesson_9.Units;

import java.util.ArrayList;

public class Spearman extends ShooterClass{

    public Spearman(String name) {
        super(40, 6, 6, 35, name);
    }

    @Override
    public void step(ArrayList<BaseHero> team) {
        System.out.println("Копейщик бросил копьё!");
    }
}
