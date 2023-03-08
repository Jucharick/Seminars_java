package Lesson_7.Units;

public class MagClass extends BaseHero{
    protected int mana;
    protected int elixir;

    public MagClass(float hp, int speed, int damage, int mana, int elixir) {
        super(hp, speed, damage);
        this.mana = mana;
        this.elixir = elixir;
    }
    
}
