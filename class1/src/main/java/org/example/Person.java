package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Person father;
    private Person mother;

    private Person grandFather1;
    private Person grandMother1;
    private Person GrandFather2;
    private Person grandMother2;
    private String sex;


    public Person(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person getFather() {
        return father;
    }


    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getGrandFather1() {
        return grandFather1;
    }

    public void setGrandFather1(Person grandFather1) {
        this.grandFather1 = grandFather1;
    }

    public Person getGrandMother1() {
        return grandMother1;
    }

    public void setGrandMother1(Person grandMother1) {
        this.grandMother1 = grandMother1;
    }

    public Person getGrandFather2() {
        return GrandFather2;
    }

    public void setGrandFather2(Person grandFather2) {
        GrandFather2 = grandFather2;
    }

    public Person getGrandMother2() {
        return grandMother2;
    }

    public void setGrandMother2(Person grandMother2) {
        this.grandMother2 = grandMother2;
    }

    @Override
    public String toString() {
        return firstName +" "+ lastName;
    }


}
