package Lesson_10.Units;

import java.util.Random;

public abstract class MagClass extends BaseHero{
    protected int mana;
    protected int elixir;
    protected static Random r;

    static {
        MagClass.r = new Random();
    }

    public MagClass(int hp, int speed, float damage, int mana, int elixir, String name, int x, int y) {
        super(hp, speed, damage, name, x, y);
        this.mana = mana;
        this.elixir = elixir;
    }

}
