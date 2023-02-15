// Дано четное число N > 0 и символы с1 и с2. 
// Написать метод который вернет строку длины N, который состоится из чередующихся символов с1 и с2, начиная с с1. 


package Lesson_2;

public class Task_001 {
    public static void main(String[] args) {
        String c1 = "c1";
        String c2 = "c2";
        int N = 8;
        String result = "";
        for (int i = 0; i < N/2; i++) {
            result = result + c1 + c2;
        }
        System.out.println(result);


        String res = createAlteratingString(c1, c2, N);
        System.out.println(res);
        
    }

    public static String createAlteratingString (String c1, String c2, int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (i% 2 == 0) sb.append(c1);
            else sb.append(c2);
        }
        return sb.toString(); // просто так вывести sb нельзя, это стриг билдер, обращаемся к методу .toString()
    }
}
