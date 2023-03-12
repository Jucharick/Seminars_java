package Lesson_8.Units;

import java.util.Random;

public abstract class MagClass extends BaseHero{
    protected int mana;
    protected int elixir;
    protected static Random r;

    static {
        MagClass.r = new Random();
    }

    public MagClass(float hp, int speed, int damage, int mana, int elixir, String name) {
        super(hp, speed, damage, name);
        this.mana = mana;
        this.elixir = elixir;
    }

    
    @Override
    public void getInfo() {
        System.out.printf("Type: %s  Hp: %f  Speed: %d  Damage: %d  Mana: %d  Elixir: %d \n",
                         this.getClass().getSimpleName(), this.hp, this.speed, this.damage, this.mana, this.elixir);
    }

    

    // this.getClass().getSimpleName() - очень медлено

    // public void GetDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    //     // else { die(); }
    // }

    // public void LossMana(int mana) {
    //     if (this.mana - 3 > 0) {
    //         this.mana -= 3;
    //     }
    // }

    // public void MagAttack(MagClass attackUnit, BaseHero unit) {
    //     System.out.printf("%s атакует %s\n", attackUnit.getClass().getSimpleName(), unit.getClass().getSimpleName());
    //     attackUnit.LossMana(mana);
    //     if (mana != 0){
    //         damage = MagClass.r.nextInt(2, 12);
    //         unit.GetDamage(damage);
    //         System.out.printf("%s теряет %d hp\n", unit.getClass().getSimpleName(), damage);
    //     }
    //     else {
    //         System.out.println("Урон не нанесен");
    //     }
    // }
    
}
