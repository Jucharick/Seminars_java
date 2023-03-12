package Lesson_9.Units;

public abstract class BaseHero  implements Unitinterface{ // собирается для всех объектов
    
    protected float hp; // protected видно только в пакете Units
    protected int speed;
    protected int damage;
    protected final String NAME; // константа, final - один раз ее установив изменить нельзя, она не изменяема
                                 // если поставить static, то имя у всех было бы одно

    public void getNAME(){
        System.out.println(NAME);
    }

    public BaseHero(float hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
    }

    // public void GetDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    // }

    @Override // аннотация - означает, что метод объявлен где-то выше
    public void step() {
        System.out.println("Шаг");
    }

    @Override
    public void getInfo() {
        System.out.printf("Type: %s  Hp: %f  Speed: %d  Damage: %d  \n",
                         this.getClass().getSimpleName(), this.hp, this.speed, this.damage);
    }
   // this.getClass().getSimpleName() - очень медлено
   
}
