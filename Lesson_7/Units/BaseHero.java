package Lesson_7.Units;
 
public class BaseHero {
    protected float hp; // protected видно только в пакете Units
    protected int speed;
    protected int damage;

    public BaseHero(float hp, int speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }
}
