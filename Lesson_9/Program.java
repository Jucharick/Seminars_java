// Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Жрец
// Крестьянин - Peasant
// Разбойник - Robber
// Снайпер - Sniper
// Колдун - Magician
// Копейщик - Spearman
// Арбалетчик - Crossbowman
// Жрец - Priest

package Lesson_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Lesson_9.Units.*;

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

        // Имя - это хэш. У двух объектов не может быть одинакового имени.

        ArrayList<BaseHero> allTeam = new ArrayList<>();
        allTeam.addAll(units1);
        allTeam.addAll(units2);     

        units1.forEach(u -> u.step(units2));

        allTeam.sort(new Comparator<BaseHero>() {
            @Override
            public int compare (BaseHero u1, BaseHero u2) {
                if (u1.getSpeed() == u2.getSpeed()){
                    return 0;
                }
                else if (u1.getSpeed() > u2.getSpeed()){
                    return 1;
                }
                else 
                    return -1;
            }
        });

        for (BaseHero bH: allTeam) {
            bH.getInfo();
        }

    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString(); // Names.values() возвращает массив имен
    }
}