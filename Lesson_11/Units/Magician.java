package Lesson_11.Units;

public class Magician extends MagClass {

    public Magician(String name, int x, int y) {
        super(35, 4, 12, 45, 1, name, x, y);
    }  

    @Override
    public void getInfo() {
        System.out.printf("Magician Hero  Hp: %d  Speed: %d  Damage: %f  Mana: %d Elixir: %d  Position(%d, %d) \n",
                         this.hp, this.speed, this.damage, this.mana, this.elixir, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Magician";
    }

}