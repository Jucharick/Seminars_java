// Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg


package Lesson_2;

import java.io.File;

public class Task_004 {
    public static void main(String[] args) {
        File dir = new File("."); // . - обозначение текущей папки
        dir.list();
    }

    private static void showExtension(String[] fileNames){
        for (int i = 0; i < fileNames.length; i++) {
            
        }
    }
}
