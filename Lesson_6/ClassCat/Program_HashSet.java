// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


package Lesson_6.ClassCat;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Program_HashSet {
    public static void main(String[] args) {
        Set<Cat> myCats = new HashSet<>();
        myCats.add(new Cat("Tayson", "Artem", "British", 
                           LocalDate.of(2021, 11, 01), "red"));
        myCats.add(new Cat("Puh", "Yaroslav", "British", 
                           LocalDate.of(2018, 07, 13), "grey"));
        myCats.add(new Cat("Barsik", "Viktoria", "Siamese", 
                           LocalDate.of(2019, 2, 28), "White"));
        myCats.add(new Cat("Puh", "Yaroslav", "British", 
                           LocalDate.of(2018, 07, 13), "grey")); // для того, чтобы в set хранились уникальные значения необходимо .equals()
        
        // когда добавили hashCode() и equals(Object obj) второй "Puh" не добавляется в Set  myCats
        System.out.println(myCats);
    }
}
