package Lesson_7.Units;

public class ManClass extends BaseHero {
    private int poisons;
    protected int dexterity;

    public ManClass(float hp, int speed, int damage, int poisons, int dexterity) {
        super(hp, speed, damage);
        this.poisons = poisons;
        this.dexterity = dexterity;
    }
    
}
