package org.example;

import java.util.HashSet;

/**
 * Immutable class Human.
 * - the class is set to final
 * - the variables are private and set to final
 * - the HashSet is cloned on object creation and can't be changed afterwards
 * - the class doesn't have any setters
 */
final class Human {
    private final String name;
    private final int age;
    private final HashSet<Pet> pets;

    public Human(String name, int age, HashSet<Pet> pets) {
        this.name = name;
        this.age = age;
        this.pets = (HashSet<Pet>) pets.clone();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HashSet<Pet> getPets() {
        return pets;
    }

    public String introduction(int petsAmount) {
        return "Привет! Меня зовут " + name + "! У меня есть " + petsAmount + " собаки: \n" + pets;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pets=" + pets +
                '}';
    }
}
