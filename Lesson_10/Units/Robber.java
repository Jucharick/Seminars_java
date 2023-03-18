package Lesson_10.Units;

public class Robber extends ManClass {

    public Robber(String name) {
        super(40, 7, 3, 3, 7, name);
    }

    @Override
    public void getInfo() {
        System.out.printf("Robber Hero  Hp: %d  Speed: %d  Damage: %f  Poisons: %d  Dexterity: %d \n",
                         this.hp, this.speed, this.damage, this.poisons, this.dexterity);
    }

    @Override
    public String toString() {
        return "Robber";
    }
    
}