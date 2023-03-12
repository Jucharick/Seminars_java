package Lesson_9.Units;

import java.util.Random;

public abstract class MagClass extends BaseHero{
    protected int mana;
    protected int elixir;
    protected static Random r;

    static {
        MagClass.r = new Random();
    }

    public MagClass(int hp, int speed, int damage, int mana, int elixir, String name) {
        super(hp, speed, damage, name);
        this.mana = mana;
        this.elixir = elixir;
    }

}
