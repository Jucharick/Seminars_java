//  Напишите метод, которвй принимает строку (String) и определяет является ли строка (палиндромом(возвращает boolean значение))
//


package Lesson_2;

import java.util.Scanner;

public class Task_002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = reader.nextLine();
        
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));

        reader.close();
    }
    private static boolean isPalindrome(String str) {
        boolean flag = false;
        StringBuilder result = new StringBuilder(str);
        String pl2 = new String(result.reverse());
        if (str.equals(pl2)){
            flag = true;
        }
        return flag;
    }
    private static boolean isPalindrome2(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
