// Напишите метод, который составляет строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, 
// обработайте исключения

package Lesson_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_003 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = reader.nextLine();
    
        writeString(repeatString(text));

        reader.close();
    }

    private static String repeatString(String part) {
        StringBuilder fullMaker = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            fullMaker.append(part);
        }
        return fullMaker.toString();
    }
        
    private static void writeString(String str) {
        FileWriter file = null;
        try {
            file = new FileWriter("Lesson_2/test.txt");
            file.append(str);
            System.out.println("Файл успешно создан");
        } catch (IOException ex) {
            System.err.println("Ошибка: " + ex);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex) {
                    System.err.println("Ошибка: " + ex);
                }
            }
        }
    }
}
