package Lesson_7.Units;

public class ManClass extends BaseHero {
    protected int poisons;
    protected int dexterity;

    public ManClass(float hp, int speed, int damage, int poisons, int dexterity) {
        super(hp, speed, damage);
        this.poisons = poisons;
        this.dexterity = dexterity;
    }

    @Override
    public String toString() {
        return String.format("Type: %s  Hp: %f  Speed: %d  Damage: %d  Poisons: %d  Dexterity: %d",
                            this.getClass().getSimpleName(), this.hp, this.speed, this.damage, this.poisons, this.dexterity);
    }
    
}
