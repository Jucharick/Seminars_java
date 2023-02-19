// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.


package Lesson_3;

import java.util.ArrayList;

public class Task_003 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Земля");

        ArrayList<String> uniquePlanets = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        countRepeats (planets, uniquePlanets, counts);
        printPlanetsCounts (uniquePlanets, counts);
    }

    private static void countRepeats ( ArrayList<String> planets, ArrayList<String> uniquePlanets, ArrayList<Integer> counts) {
        for (String planet: planets) {
            int pos = uniquePlanets.indexOf((planet));
            if (pos >=0 ) {
                int count = counts.get(pos) + 1; // .get(pos) вместо []
                counts.set(pos, count);
            }
            else {
                uniquePlanets.add(planet);
                counts.add(1);
            }
        }
    }

    private static void printPlanetsCounts (ArrayList<String> uniquePlanets, ArrayList<Integer> counts) {
        for (int i = 0; i < uniquePlanets.size(); i++) {
            System.out.printf("%-10s %3d \n", uniquePlanets.get(i), counts.get(i)); // -10  на строку отводится 10 знаков и "-" - выравнивание по левому краю
        }
    }
}
