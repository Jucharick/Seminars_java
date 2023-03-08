package Lesson_7.Units;

import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random r;

    protected float hp; // protected видно только в пакете Units
    protected int speed;
    protected int damage;

    public BaseHero(float hp, int speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void Attack(BaseHero target) {
        damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
}
