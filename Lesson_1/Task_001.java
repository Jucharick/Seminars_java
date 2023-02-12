// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получите строку и выведете сообщение "Привет, <Имя>! "

import java.util.Scanner;

public class Task_001 {
    public static void main(String[] args) {
        // Получение данных из терминала - от пользователя
        
        // System.out.println("Назовите ваше имя: ");
        System.out.printf("Назовите ваше имя: ");
        Scanner iScanner = new Scanner(System.in, "cp866"); // "cp866" - кодировка позволяет принимать кириллицу, без этого аркумента можно написать имя только латинскими буквами
        String name = iScanner.nextLine(); // считает все слова через пробел, пока не будет нажат enter
        // System.out.println(String.format("Привет, %s!", name));
        System.out.printf("Привет, %s!", name); // s - string
        iScanner.close();
    }
}
