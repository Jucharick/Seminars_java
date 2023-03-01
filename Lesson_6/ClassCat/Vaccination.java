package Lesson_6.ClassCat;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private String producer;
    private String name;  

    public Vaccination(LocalDate date, String producer, String name) {
        this.date = date; // this. указывает на текущий объект с которым мы сейчас работаем
        this.producer = producer;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    // public void setDate (LocalDate date) {
    //     this.date = date;
    // }

    

// ctrl + .   вызывает лампочку => выбираем создание конструктора

    @Override
    public String toString() {
        return "Vaccination [date=" + date + ", producer=" + producer + ", name=" + name + "]";
    }

}

