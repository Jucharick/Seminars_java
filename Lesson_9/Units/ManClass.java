package Lesson_9.Units;

public abstract class ManClass extends BaseHero {
    protected int poisons;
    protected int dexterity;

    public ManClass(float hp, int speed, int damage, int poisons, int dexterity, String name) {
        super(hp, speed, damage, name);
        this.poisons = poisons;
        this.dexterity = dexterity;
    }

    @Override
    public void getInfo() {
        System.out.printf("Type: %s  Hp: %f  Speed: %d  Damage: %d  Poisons: %d  Dexterity: %d \n",
                         this.getClass().getSimpleName(), this.hp, this.speed, this.damage, this.poisons, this.dexterity);
    }

    // this.getClass().getSimpleName() - очень медлено

}
