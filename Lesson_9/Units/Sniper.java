package Lesson_9.Units;

import java.util.ArrayList;

public class Sniper extends ShooterClass{
    public Sniper(String name) {
        super(40, 5, 9, 21, name);
    }

    @Override
    public void step(ArrayList<BaseHero> team) {
        System.out.println("Снайпер выстрелил!");
    }
    
}