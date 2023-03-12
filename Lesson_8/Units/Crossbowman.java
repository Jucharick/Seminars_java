package Lesson_8.Units;
public class Crossbowman extends ShooterClass{
     
    public Crossbowman () {
        super(50, 6, 7, 56);
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик выстрелил!");
    }
}