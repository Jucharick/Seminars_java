import java.util.Arrays;

// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.


public class Task_003 {
    public static void main(String[] args) {
        int[] my_array = new int[] {3,2,2,3,2,3,3,4,5,3,3,2,2,1,2,2};
        int val = 3;
        int pos = my_array.length-1;
        for (int i = 0; i < pos; i++) {
            if (my_array[i] == val) {
                while (my_array[pos] == 3 && pos > i) {
                    pos--;
                }
                int temp = my_array[i];
                my_array[i] = my_array[pos];
                my_array[pos] = temp;
                pos--;
            }
        }
        System.out.println(Arrays.toString(my_array)); // класс Arrays, метод кдасса toString() преобразует в строку и в таком виде можно напечатать
    }
}
