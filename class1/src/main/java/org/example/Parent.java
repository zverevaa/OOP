package org.example;

import java.util.List;

public class Parent extends Person{

    private Child child;
    public Parent(String firstName, String lastName, String sex) {
        super(firstName, lastName, sex);
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
