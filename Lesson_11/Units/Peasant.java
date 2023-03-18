package Lesson_11.Units;

public class Peasant extends ManClass {

    public Peasant(String name, int x, int y) {
        super(40, 7, 3, 0, 2, name, x, y);
    }

    @Override
    public void getInfo() {
        System.out.printf("Peasant Hero  Hp: %d  Speed: %d  Damage: %f  Poisons: %d  Dexterity: %d  Position(%d, %d) \n",
                         this.hp, this.speed, this.damage, this.poisons, this.dexterity, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Peasant";
    }

}