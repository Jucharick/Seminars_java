// 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// 1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


package Lesson_6;

import java.util.HashSet;
import java.util.Random;

public class Task_002 {
    public static void main(String[] args) {
        int [] array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(25); // 0 -24
        }

        System.out.println(calcPercent(array));
    }

// float  4 байта, хранит 7 знаков после запятой
// double  8 байта, хранит 15 знаков после запятой
// выбираем в зависимости от необходимой точности 

    private static float calcPercent(int[] array) {
        HashSet<Integer> uniq = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            uniq.add(array[i]);
        }

        // 25 элементов (от 0 до 24) / 1000 (всего элементов в array) * 100 = 2,5 %
        return uniq.size() * 100f/ array.length; // при целочисленном деление ответ 2 => ставим суффикс f, чтобы было хоть одно число float
    }
}
