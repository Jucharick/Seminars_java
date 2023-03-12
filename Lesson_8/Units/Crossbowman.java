package Lesson_8.Units;
public class Crossbowman extends ShooterClass{
     
    public Crossbowman (String name) {
        super(50, 6, 7, 56, name);
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик выстрелил!");
    }
}