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

        

        ArrayList<BaseHero> units1 = new ArrayList<>();
        ArrayList<BaseHero> units2 = new ArrayList<>();

        int posXTeam1 = 1;
        int posXTeam2 = 10;

        for (int i = 0; i < UNIT; i++) {
            switch(new Random().nextInt(7)) {
                case 0:
                    units1.add(new Crossbowman(getName(), posXTeam1, i+1));
                    break;
                case 1:
                    units1.add(new Magician(getName(), posXTeam1, i+1));
                    break;
                case 2:
                    units1.add(new Peasant(getName(), posXTeam1, i+1));
                    break;
                case 3:
                    units1.add(new Priest(getName(), posXTeam1, i+1));
                    break;
                case 4:
                    units1.add(new Robber(getName(), posXTeam1, i+1));
                    break;
                case 5:
                    units1.add(new Sniper(getName(), posXTeam1, i+1));
                    break;
                case 6:
                    units1.add(new Spearman(getName(), posXTeam1, i+1));
                    break;
            }
            switch(new Random().nextInt(7)) {
                case 0:
                    units2.add(new Crossbowman(getName(), posXTeam2, i+1));
                    break;
                case 1:
                    units2.add(new Magician(getName(), posXTeam2, i+1));
                    break;
                case 2:
                    units2.add(new Peasant(getName(), posXTeam2, i+1));
                    break;
                case 3:
                    units2.add(new Priest(getName(), posXTeam2, i+1));
                    break;
                case 4:
                    units2.add(new Robber(getName(), posXTeam2, i+1));
                    break;
                case 5:
                    units2.add(new Sniper(getName(), posXTeam2, i+1));
                    break;
                case 6:
                    units2.add(new Spearman(getName(), 10, i+1));
                    break;
            }
        }


        // Имя - это хэш. У двух объектов не может быть одинакового имени.  

        // units1.forEach(u -> u.step(units2));
        // System.out.println("Team 1");
        // units1.forEach(u -> u.getInfo());
        // System.out.println("Team 2");
        // units2.forEach(u -> u.getInfo());

        units1.forEach(u -> u.step(units2));

    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString(); // Names.values() возвращает массив имен
    }
}




