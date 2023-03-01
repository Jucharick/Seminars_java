package Lesson_6.ClassCat;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat {
    private String name;
    private String owner;
    private String breed;
    private LocalDate dateBirth;
    private String color;
    private ArrayList<Vaccination> vaccinations = new ArrayList<>();

    public Cat(String name, String owner, String breed, LocalDate dateBirth, String color) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.dateBirth = dateBirth;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", dateBirth=" + dateBirth + ", color="
                + color + ", vaccinations=" + vaccinations + "]";
    }

    public void addVaccination(Vaccination vaccination) {
        vaccinations.add(vaccination);
    }

}
