package Lesson_9.Units;

public class Peasant extends ManClass {

    public Peasant(String name) {
        super(40, 7, 3, 0, 2, name);
    }

    @Override
    public void getInfo() {
        System.out.printf("Peasant Hero  Hp: %d  Speed: %d  Damage: %d  Poisons: %d  Dexterity: %d \n",
                         this.hp, this.speed, this.damage, this.poisons, this.dexterity);
    }

    @Override
    public String toString() {
        return "Peasant";
    }
    
}