// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

 package Lesson_6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Task_001 {
    public static void main(String[] args) {
        HashSet<Integer> heshSet = new HashSet<>(); // можно сразу HashSet<Integer> heshSet = new HashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3)); 
        heshSet.addAll(List.of(4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3)); //  повторы удаляются, только уникальные значения 
        // [1, 2, 3, 4, 5, 6] по хэш таблице

        System.out.println(heshSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(List.of(4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3)); // только уникальные значения
        // сохраняет порядок

        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(List.of(4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3)); // только уникальные значения
        // [1, 2, 3, 4, 5, 6] по хэш таблице

        System.out.println(treeSet);
    }
}
