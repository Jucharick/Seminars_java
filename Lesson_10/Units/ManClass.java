package Lesson_10.Units;

public abstract class ManClass extends BaseHero {
    protected int poisons;
    protected int dexterity;

    public ManClass(int hp, int speed, int damage, int poisons, int dexterity, String name) {
        super(hp, speed, damage, name);
        this.poisons = poisons;
        this.dexterity = dexterity;
    }

}
