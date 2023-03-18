package Lesson_11.Units;

public class Robber extends ManClass {

    public Robber(String name, int x, int y) {
        super(40, 7, 3, 3, 7, name, x, y);
    }

    @Override
    public void getInfo() {
        System.out.printf("Robber Hero  Hp: %d  Speed: %d  Damage: %f  Poisons: %d  Dexterity: %d  Position(%d, %d) \n",
                         this.hp, this.speed, this.damage, this.poisons, this.dexterity, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Robber";
    }
    
}