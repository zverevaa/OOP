package org.example;

public class Main {
    public static void main(String[] args) {
        Grandparent henry = new Grandparent("Henry","Smith", "Male");
        Grandparent brigitte = new Grandparent("Brigitte", "Olafson", "Female");
        Parent jacob = new Parent("Jacob", "Smith", "Male");
        Parent mary = new Parent("Mary", "Anderson", "Female");
        Child will = new Child("William", "Smith", "Male");
        jacob.setChild(will);
        will.setFather(jacob);
        will.setMother(mary);
        henry.setChild(jacob);
        brigitte.setChild(jacob);
        will.setGrandFather1(henry);
        will.setGrandMother1(brigitte);
        henry.setGrandchild(will);
        System.out.println(jacob.getChild());
        System.out.println(will.getParents());
        System.out.println(will.getGrandparents());
        System.out.println(henry.getGrandchildren());
        System.out.println(henry.getChildren());
    }

}