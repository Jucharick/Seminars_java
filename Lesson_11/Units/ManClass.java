package Lesson_11.Units;

public abstract class ManClass extends BaseHero {
    protected int poisons;
    protected int dexterity;

    public ManClass(String type, int hp, int speed, float damage, int poisons, int dexterity, String name, int x, int y) {
        super(type, hp, speed, damage, name, x, y);
        this.poisons = poisons;
        this.dexterity = dexterity;
    }

}
