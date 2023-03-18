// Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Жрец
// Крестьянин - Peasant
// Разбойник - Robber
// Снайпер - Sniper
// Колдун - Magician
// Копейщик - Spearman
// Арбалетчик - Crossbowman
// Жрец - Priest

package Lesson_10;

import java.util.ArrayList;
import java.util.Random;

import Lesson_10.Units.*;

public class Program {

    public static final int UNIT = 10;
    public static void main(String[] args) {
        // классы загружаются в память (в специальную область памяти и там просто лежат, занимают место) и потом используются для того, чтобы посчитать 
        // сколько памяти нужно для объектов, собранных из этих классов
        // static - публичный класс загружает виртуальная машина java и она не создает объект на базе класса Program, а она из класса Program 
        // сразу вызывает метод main, и чтобы виртуальная машина java смогла его вызвать он должен быть статичным - это значит,
        // что при загрузки этого метода адресс метода main сразу генерируется. И все методы, которые мы вызываем прям из класса, тоже должны быть 
        // статичными и адрес сразу был.

        // если убрать static, то надо сначала создать объект класса

        

        ArrayList<BaseHero> units = new ArrayList<>();


        for (int i = 0; i < UNIT; i++) {
            switch(new Random().nextInt(7)) {
                case 0:
                    units.add(new Crossbowman(getName()));
                    break;
                case 1:
                    units.add(new Magician(getName()));
                    break;
                case 2:
                    units.add(new Peasant(getName()));
                    break;
                case 3:
                    units.add(new Priest(getName()));
                    break;
                case 4:
                    units.add(new Robber(getName()));
                    break;
                case 5:
                    units.add(new Sniper(getName()));
                    break;
                case 6:
                    units.add(new Spearman(getName()));
                    break;
            }
        }


        // Имя - это хэш. У двух объектов не может быть одинакового имени.

    //     ArrayList<BaseHero> allTeam = new ArrayList<>();
    //     allTeam.addAll(units1);
    //     allTeam.addAll(units2);     

        units.forEach(u -> u.step(units));
        units.forEach(u -> u.getInfo());


    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString(); // Names.values() возвращает массив имен
    }
}




