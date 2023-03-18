package Lesson_10.Units;

import java.util.ArrayList;

public abstract class BaseHero  implements Unitinterface{ // собирается для всех объектов
    
    protected int hp; // protected видно только в пакете Units
    protected int speed;
    protected float damage;
    protected final String NAME; // константа, final - один раз ее установив изменить нельзя, она не изменяема
                                 // если поставить static, то имя у всех было бы одно
    protected String state;

    public void getNAME(){
        System.out.println(NAME);
    }

    public BaseHero(int hp, int speed, float damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
        state = "Stand"; // стоит, ничего не делает
    }

    public int getSpeed() {
        return speed;
    }

    @Override // @Override - аннотация
    public void step(ArrayList<BaseHero> team ) {
        System.out.println("Шаг!");// заглушка
    }

    @Override
    public void getInfo() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "";
    }
   
   public void loseDamage(float damage) {
        if (this.hp - damage >= 0) {
            this.hp -= damage;
        }
        else {
            this.hp = 0;
        }
    }

   public void attack(BaseHero unit) {
        
   }

}
