// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.


package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_001 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((int) (Math.random() * 100)); 
        }

        System.out.println("Заполнение ArrayList заняло " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        LinkedList<Integer> numbers1 = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            numbers1.add((int) (Math.random() * 100)); 
        }

        System.out.println("Заполнение LinkedList заняло " + (System.currentTimeMillis() - time));
    }
}
