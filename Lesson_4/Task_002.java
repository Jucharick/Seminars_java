// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида 
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


package Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);     

        LinkedList<String> inputList = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите строку по типу text~num: ");
            String inputText = reader.nextLine();
            String[] splitInput = inputText.split ("~");
            int pos = Integer.parseInt(splitInput[1]);
            if (splitInput[0].equals("print")){
                System.out.println(inputList.get(pos));
                inputList.remove(pos);
            } else {
                inputList.add(pos, splitInput[0]);
            }
        }
                
        
        System.out.println(inputList);

        reader.close();
    }
}
