package Lesson_10.Units;

public class Priest extends MagClass{

    public Priest(String name, int x, int y) {
        super(30, 3, 15, 50, 10, name, x, y);
    }

    @Override
    public void getInfo() {
        System.out.printf("Priest Hero  Hp: %d  Speed: %d  Damage: %f  Mana: %d Elixir: %d  Position(%d, %d) \n",
                         this.hp, this.speed, this.damage, this.mana, this.elixir, this.position.x, this.position.y);
    }

    @Override
    public String toString() {
        return "Priest";
    }

}
