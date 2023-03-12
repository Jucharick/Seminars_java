package Lesson_8.Units;

public abstract class BaseHero  implements Unitinterface{
    
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

    @Override // аннотация - означает, что метод объявлен где-то выше
    public void step() {
        System.out.println("Шаг");
    }
   
}
