// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.


public class Task_002 {
    public static void main(String[] args) {
        int[] my_array = new int[] {1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,1,111};
        
        int count = 0;
        int maxLength = 0;
        // сниппет fori
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == 1) {
                count ++;
            } else {
                if (maxLength < count) { // проверяем если текущая цепочка длиннее чем хранящаяся в maxLength мы перезаписываем maxLength
                    maxLength = count;
                }
                count = 0;
            }
        }
        if (maxLength < count) { // проверяем если последняя цепочка длиннее чем хранящаяся в maxLength мы перезаписываем maxLength
                maxLength = count;
        }
        System.out.println(maxLength); // выводим самую длинную цепочку
    }
}
