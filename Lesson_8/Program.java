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

import Lesson_8.Units.Sniper;
import Lesson_8.Units.BaseHero;
import Lesson_8.Units.Crossbowman;
import Lesson_8.Units.Spearman;
import Lesson_8.Units.Magician;
import Lesson_8.Units.Priest;
import Lesson_8.Units.Peasant;
import Lesson_8.Units.Robber;

public class Program {
    public static void main(String[] args) {

        Sniper sniper = new Sniper();
        Crossbowman xBowMan = new Crossbowman();
        Spearman spearman = new Spearman();
        Magician magician = new Magician();
        Priest priest = new Priest();
        Peasant peasant = new Peasant();
        Robber robber = new Robber();
        
        // System.out.println("Hero_1: " + sniper.toString());
        // System.out.println("Hero_2: " + xBowMan.toString());
        // System.out.println("Hero_3: " + spearman.toString());

        // System.out.println("Hero_4: " + magician.toString());
        // System.out.println("Hero_5: " + priest.toString());

        // System.out.println("Hero_6: " + peasant.toString());
        // System.out.println("Hero_7: " + robber.toString());

        // sniper.ShooterAttack(sniper, spearman);
        // System.out.println("Hero_3: " + spearman.toString());
        // System.out.println("Hero_1: " + sniper.toString());

        // sniper.ShooterAttack(sniper, spearman);
        // System.out.println("Hero_3: " + spearman.toString());
        // System.out.println("Hero_1: " + sniper.toString());

        // magician.MagAttack(magician, spearman);
        // System.out.println("Hero_3: " + spearman.toString());
        // System.out.println("Hero_4: " + magician.toString());

        // magician.MagAttack(magician, spearman);
        // System.out.println("Hero_3: " + spearman.toString());
        // System.out.println("Hero_4: " + magician.toString());

        // spearman.ShooterAttack(spearman, magician);
        // System.out.println("Hero_3: " + spearman.toString());
        // System.out.println("Hero_4: " + magician.toString());

        // spearman.ShooterAttack(spearman, magician);
        // System.out.println("Hero_3: " + spearman.toString());
        // System.out.println("Hero_4: " + magician.toString());

        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(new Crossbowman());
        list.add(new Priest());
        list.add(new Peasant());
        list.add(new Sniper());

        list.forEach(b -> b.step());
    }
}