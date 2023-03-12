package Lesson_8.Units;

public class Sniper extends ShooterClass{
    public Sniper() {
        super(40, 5, 9, 21);
    }

    @Override
    public void step() {
        System.out.println("Снайпер выстрелил!");
    }

    
}