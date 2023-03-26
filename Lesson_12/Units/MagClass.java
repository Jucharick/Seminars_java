package Lesson_12.Units;

import java.util.Random;

public abstract class MagClass extends BaseHero{
    protected int mana;
    protected int elixir;
    protected static Random r;

    static {
        MagClass.r = new Random();
    }

    public MagClass(String type, int hp, int speed, float damage, int mana, int elixir, String name, int x, int y) {
        super(type, hp, speed, damage, name, x, y);
        this.mana = mana;
        this.elixir = elixir;
    }

}
