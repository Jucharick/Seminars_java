package Lesson_10.Units;

public abstract class ManClass extends BaseHero {
    protected int poisons;
    protected int dexterity;

    public ManClass(int hp, int speed, float damage, int poisons, int dexterity, String name, int x, int y) {
        super(hp, speed, damage, name, x, y);
        this.poisons = poisons;
        this.dexterity = dexterity;
    }

}
