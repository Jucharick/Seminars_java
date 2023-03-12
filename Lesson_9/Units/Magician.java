package Lesson_9.Units;
 
public class Magician extends MagClass {

    public Magician(String name) {
        super(35, 4, 12, 45, 1, name);
    }  

    @Override
    public void getInfo() {
        System.out.printf("Magician Hero  Hp: %d  Speed: %d  Damage: %d  Mana: %d Elixir: %d\n",
                         this.hp, this.speed, this.damage, this.mana, this.elixir);
    }

    @Override
    public String toString() {
        return "Magician";
    }

}