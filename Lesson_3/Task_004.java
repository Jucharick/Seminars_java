// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


package Lesson_3;

import java.util.ArrayList;

public class Task_004 {
    public static void main(String[] args) {
        ArrayList mixed = new ArrayList<String>(); // стирание типов - справа создали список <String>, а слева "сказали" забудь, что он <String>
        mixed.add("Hello");
        mixed.add("Hello");
        mixed.add(12);
        mixed.add(2);
        mixed.add(21);
        mixed.add("Юпитер");
        mixed.add(4);
        mixed.add("Земля");
        mixed.add("World");

        System.out.println(mixed);
        deleteIntElement (mixed);
        System.out.println(mixed);
    }

    private static void deleteIntElement (ArrayList mixed) {
        for (int i = 0; i <mixed.size(); i++) {
            if (mixed.get(i) instanceof Integer){
                mixed.remove(i);
                i--; // если мы удаляем элемент, то коллекция уменьшается на 1 элемент и следовательно следующий i перескакивает один элемент
            }
        }
    }
}
