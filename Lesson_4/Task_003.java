// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.


package Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_003 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        LinkedList<String> inputList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            String inputText = reader.nextLine();

            if (inputText.equalsIgnoreCase("print")){
                String temp = inputList.get(0);
                inputList.set(0, inputList.get(i-1));
                inputList.set(i-1, temp);
            } else if  (inputText.equalsIgnoreCase("revert")) {
                inputList.remove(i-1);
            } else {
                inputList.add(i, inputText);
            }
        }
        System.out.println(inputList);
        reader.close();
    }
}
