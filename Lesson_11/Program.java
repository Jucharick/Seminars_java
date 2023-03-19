// Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Жрец
// Крестьянин - Peasant
// Разбойник - Robber
// Снайпер - Sniper
// Колдун - Magician
// Копейщик - Spearman
// Арбалетчик - Crossbowman
// Жрец - Priest

package Lesson_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import Lesson_11.Units.*;

public class Program {

    public static final int GANG_SIZE = 10;

    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;
    public static ArrayList<BaseHero> allUnits;
    
    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            makeStep();
            scanner.nextLine();
        }

    }


    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString(); // Names.values() возвращает массив имен
    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>(); 
        allUnits = new ArrayList<>(); 

        int posXTeam1 = 1;
        int posXTeam2 = 10;

        for (int i = 1; i < GANG_SIZE + 1; i++) {
            switch(new Random().nextInt(7)) {
                case 0:
                    whiteSide.add(new Crossbowman(getName(), posXTeam1, i+1));
                    break;
                case 1:
                    whiteSide.add(new Magician(getName(), posXTeam1, i+1));
                    break;
                case 2:
                    whiteSide.add(new Peasant(getName(), posXTeam1, i+1));
                    break;
                case 3:
                    whiteSide.add(new Priest(getName(), posXTeam1, i+1));
                    break;
                case 4:
                    whiteSide.add(new Robber(getName(), posXTeam1, i+1));
                    break;
                case 5:
                    whiteSide.add(new Sniper(getName(), posXTeam1, i+1));
                    break;
                case 6:
                    whiteSide.add(new Spearman(getName(), posXTeam1, i+1));
                    break;
            }
            switch(new Random().nextInt(7)) {
                case 0:
                    darkSide.add(new Crossbowman(getName(), posXTeam2, i+1));
                    break;
                case 1:
                    darkSide.add(new Magician(getName(), posXTeam2, i+1));
                    break;
                case 2:
                    darkSide.add(new Peasant(getName(), posXTeam2, i+1));
                    break;
                case 3:
                    darkSide.add(new Priest(getName(), posXTeam2, i+1));
                    break;
                case 4:
                    darkSide.add(new Robber(getName(), posXTeam2, i+1));
                    break;
                case 5:
                    darkSide.add(new Sniper(getName(), posXTeam2, i+1));
                    break;
                case 6:
                    darkSide.add(new Spearman(getName(), 10, i+1));
                    break;
            }
        }

        allUnits.addAll(whiteSide);
        allUnits.addAll(darkSide);
    }

    private static void makeStep(){
        HashSet<Integer> speedRates = new HashSet<>();
        for (BaseHero units: allUnits) {
            speedRates.add(units.getSpeed());
        }

        ArrayList<Integer> speeds = new ArrayList<>(speedRates);
        Collections.sort(speeds, Collections.reverseOrder(null));

        for (int speed : speeds) {
            ArrayList<BaseHero>speedArray = new ArrayList<>();
            for (BaseHero unit: allUnits) {
                if (unit.getSpeed() == speed) {
                    speedArray.add(unit);
                }
            }

            Collections.shuffle(speedArray);

            for (BaseHero hero : speedArray) {
                if (hero.toString().equals(darkSide)) {
                    hero.step(whiteSide);
                }
                else {
                    hero.step(darkSide);
                }
                System.out.println("Персонаж " + hero.toString() + " со скоростью " + hero.getSpeed() + " сделал ход");
            }
        }
    }

}




