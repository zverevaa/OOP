package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String[] petNames = {"Шарик", "Тузик", "Бобик"};
        String[] petBreeds = {"доберман", "лабрадор", "ротвейлер"};
        HashSet<Pet> pets = new HashSet<>();
        for (int i = 0; i < petNames.length; i++) {
            pets.add(new Pet(petNames[i], petBreeds[i]));
        }
        Human jack = new Human("Джек", 27, pets);

        System.out.println(jack);

        // pets HashSet immutability check
        for (int i = 0; i < petNames.length; i++) {
            pets.add(new Pet("Woof", "Meow"));
        }

        System.out.println(jack);

        System.out.println(jack.introduction(petNames.length));

    }
}