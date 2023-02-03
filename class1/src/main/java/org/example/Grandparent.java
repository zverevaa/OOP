package org.example;

import java.util.List;

public class Grandparent extends Person{

    Parent child;
    Child grandchild;
    public Grandparent(String firstName, String lastName, String sex) {
        super(firstName, lastName, sex);
    }

    public Parent getChild() {
        return child;
    }

    public void setChild(Parent child) {
        this.child = child;
    }

    public Child getGrandchild() {
        return grandchild;
    }

    public void setGrandchild(Child grandchild) {
        this.grandchild = grandchild;
    }

    public String getChildren() {
        return "Children: " + child;
    }
    public String getGrandchildren() {
        return "Grandchildren: " + grandchild;
    }
}
