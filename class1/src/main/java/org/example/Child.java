package org.example;

import java.util.List;

public class Child extends Person {

    public Child(String firstName, String lastName, String sex) {
        super(firstName, lastName, sex);
    }

    public String getParents() {
        return "Father: " + getFather() + "\nMother: " + getMother();
    }

    public String getGrandparents() {
        return "Grandfather(Father): " + getGrandFather1() + "\nGrandmother(Father): " + getGrandMother1() + "\nGrandfather(Mother): " + getGrandFather2() + "\nGrandmother(Mother): " + getGrandMother2();
    }

}

