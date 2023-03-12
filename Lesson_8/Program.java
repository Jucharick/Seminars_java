// Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Жрец
// Крестьянин - Peasant
// Разбойник - Robber
// Снайпер - Sniper
// Колдун - Magician
// Копейщик - Spearman
// Арбалетчик - Crossbowman
// Жрец - Priest

package Lesson_8;

import java.util.ArrayList;
import java.util.Random;

import Lesson_8.Units.*;

public class Program {
    public static void main(String[] args) {
        // классы загружаются в память (в специальную область памяти и там просто лежат, занимают место) и потом используются для того, чтобы посчитать 
        // сколько памяти нужно для объектов, собранных из этих классов
        // static - публичный класс загружает виртуальная машина java и она не создает объект на базе класса Program, а она из класса Program 
        // сразу вызывает метод main, и чтобы виртуальная машина java смогла его вызвать он должен быть статичным - это значит,
        // что при загрузки этого метода адресс метода main сразу генерируется. И все методы, которые мы вызываем прям из класса, тоже должны быть 
        // статичными и адрес сразу был.

        // если убрать static, то надо сначала создать объект класса

        ArrayList<BaseHero> units1 = new ArrayList<>();
        ArrayList<BaseHero> units2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch(new Random().nextInt(7)) {
                case 0:
                    units1.add(new Crossbowman(getName()));
                    break;
                case 1:
                    units1.add(new Magician(getName()));
                    break;
                case 2:
                    units1.add(new Peasant(getName()));
                    break;
                case 3:
                    units1.add(new Priest(getName()));
                    break;
                case 4:
                    units1.add(new Robber(getName()));
                    break;
                case 5:
                    units1.add(new Sniper(getName()));
                    break;
                case 6:
                    units1.add(new Spearman(getName()));
                    break;
            }
            switch(new Random().nextInt(7)) {
                case 0:
                    units2.add(new Crossbowman(getName()));
                    break;
                case 1:
                    units2.add(new Magician(getName()));
                    break;
                case 2:
                    units2.add(new Peasant(getName()));
                    break;
                case 3:
                    units2.add(new Priest(getName()));
                    break;
                case 4:
                    units2.add(new Robber(getName()));
                    break;
                case 5:
                    units2.add(new Sniper(getName()));
                    break;
                case 6:
                    units2.add(new Spearman(getName()));
                    break;
            }
        }

        System.out.println("Team 1");
        for (BaseHero bH: units1) {
            bH.getNAME();
            bH.getInfo();
            bH.step();
        }

        System.out.println();

        System.out.println("Team 2");
        for (BaseHero bH: units2) {
            bH.getNAME();
            bH.getInfo();
        }
    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString(); // Names.values() возвращает массив имен
    }
}