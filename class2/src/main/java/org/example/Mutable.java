package org.example;

import java.util.Map;

public class Mutable {
    private Map<String, String> myMap;
    private String myString;

    public Mutable(Map<String, String> myMap, String myString) {
        this.myMap = myMap;
        this.myString = myString;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "Mutable: " +
                "myMap=" + myMap + "\nMy string is: " + myString;
    }
}
