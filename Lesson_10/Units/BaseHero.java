package Lesson_10.Units;

import java.util.ArrayList;

public abstract class BaseHero  implements Unitinterface{ // собирается для всех объектов
    
    protected int hp; // protected видно только в пакете Units
    protected int speed;
    protected int damage;
    protected final String NAME; // константа, final - один раз ее установив изменить нельзя, она не изменяема
                                 // если поставить static, то имя у всех было бы одно

    public void getNAME(){
        System.out.println(NAME);
    }

    public BaseHero(int hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override // аннотация - означает, что метод объявлен где-то выше
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
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
   
   public void loseDamage(int damage) {
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
