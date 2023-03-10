package Lesson_9.Units;
 
public class Priest extends MagClass{

    public Priest(String name) {
        super(30, 3, 15, 50, 10, name);
    }

    @Override
    public void getInfo() {
        System.out.printf("Priest Hero  Hp: %d  Speed: %d  Damage: %d  Mana: %d Elixir: %d\n",
                         this.hp, this.speed, this.damage, this.mana, this.elixir);
    }

    @Override
    public String toString() {
        return "Priest";
    }
    
}
