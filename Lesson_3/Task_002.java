// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.


package Lesson_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_002 {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            collection.add(rnd.nextInt(0, 11));
        }

        System.out.println(collection);
        collection.sort(new MyComparator()); // если вместо класса MyComparator() использовать null - сортировка отработает, т.к. это int, по возрастанию 
        System.out.println(collection);
    }
}
