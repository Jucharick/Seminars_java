// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. 

package Lesson_4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_004 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            String inputText = reader.nextLine();
            inputList.add(i, inputText);
        }

        System.out.println(inputList);
        getArray(inputList);

        reader.close();
    }

    private static void getArray (ArrayList<String> array){
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < array.size(); i++) {
            deque.addFirst(array.get(i));
        }
        System.out.println(deque);
    }
}
