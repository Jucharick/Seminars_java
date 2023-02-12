// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получите строку и выведете сообщение "Привет, <Имя>! "


// c++, C, C#, JAVA
// кавычки "string" - string - для нескольких символов или ноль символов
// кавычки 'с' - char - для одного символа
// '\n' - считается одним символом


import java.util.Scanner;

public class Task_001 {
    public static void main(String[] args) {
        // Получение данных из терминала - от пользователя

        // System.out.println("Назовите ваше имя: ");
        System.out.printf("Назовите ваше имя: ");
        Scanner iScanner = new Scanner(System.in, "cp866"); // "cp866" - кодировка позволяет принимать кириллицу, без этого аркумента можно написать имя только латинскими буквами
        String name = iScanner.nextLine(); // считает все слова через пробел, пока не будет нажат enter
        // System.out.println(String.format("Привет, %s!", name));
        System.out.printf("Привет, %s!\n", name); // s - string, %d - число (int, как десятичная система)
        iScanner.close();

        // print -> print печетает строку и не переведет курсор
        // println -> print Line печетает строку и в конце переведет курсор \n, подстановку сделать нельзя
        // printf -> print печеть с форматированием (с подстановкой) и не переведет курсор (сами добавляем \n)
    }
}
