package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         * A basic immutable class
         */
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

        /**
         * Immutability with hashmaps
         */

        //Mutable class

        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("Key1", "Value1");
        mutableMap.put("Key2", "Value2");

        String string1 = "xyz";
        Mutable mutableObject = new Mutable(mutableMap, string1);
        System.out.println("\nMap and string before modifying the mutable object");
        System.out.println(mutableObject);
        mutableMap.put("Key3", "Value3");
        mutableObject.setMyString("zyx");
        System.out.println("\nMap and string after modifying the mutable object");
        System.out.println(mutableObject);

        //Immutable class

        String imString = "abc";

        Immutable immutableObject = new Immutable(mutableMap, imString);
        System.out.println("\nMap and string before modifying the immutable object");
        System.out.println(immutableObject);
        mutableMap.put("Key4", "Value4");
        //the object doesn't have a setter, so it can't be changed
        System.out.println("\nMap and string after modifying the immutable object");
        System.out.println(immutableObject);

    }
}