// Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является


package Lesson_6.ClassCat;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination(LocalDate.of(2023, 2, 28), "Bayer", "NGH1");
        System.out.println(vaccination);

        // vaccination.setDate(LocalDate.of(2021, 12, 02)); // поменяли дату
        System.out.println(vaccination.getDate());

        Cat cat = new Cat("Barsik", "Viktoria", "Siamese", LocalDate.of(2019, 2, 28), "White");
        cat.addVaccination(vaccination);
        cat.addVaccination(new Vaccination(LocalDate.of(2021, 11, 01), "Bayer", "JJ34"));
        System.out.println(cat);
    }
}
