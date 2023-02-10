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

        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("Key1", "Value1");
        mutableMap.put("Key2", "Value2");


        //Mutable class
        String string1 = "xyz";
        Mutable mutableObject = new Mutable(mutableMap, string1);

        //Immutable class
        String imString = "abc";
        Immutable immutableObject = new Immutable(mutableMap, imString);

        System.out.println("#########");

        checkImmutability((Object) mutableObject, (HashMap) mutableMap);
        checkImmutability((Object) immutableObject, (HashMap) mutableMap);

    }

    public static void checkImmutability(Object object, HashMap map) {
        map.put("TestKey1", "TestValue1");
        map.put("TestKey2", "TestValue2");
        if(object instanceof Mutable) {
            ((Mutable) object).setMyString("zyx");
        }
        System.out.println(object);
    }
}