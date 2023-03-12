package Lesson_9.Units;

import java.util.ArrayList;

public class Crossbowman extends ShooterClass{
     
    public Crossbowman (String name) {
        super(50, 6, 7, 56, name);
    }

    @Override
    public void step(ArrayList<BaseHero> team) {
        System.out.println("Арбалетчик выстрелил!");
    }
}