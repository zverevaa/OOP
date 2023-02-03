package org.example;

import java.util.HashMap;
import java.util.Map;

final class Immutable {

    private final String myString;
    private final Map<String, String> myMap;

    public Immutable(Map<String, String> myMap, String myString) {
        this.myString = myString;
        Map<String, String> deepCopy = new HashMap<String, String>();
        for (String key: myMap.keySet()) {
            deepCopy.put(key, myMap.get(key));
        }
        this.myMap = deepCopy;
    }

    public Map<String, String> getMyMap() {
        Map<String, String> deepCopy = new HashMap<String, String>();
        for(String key : myMap.keySet()) {
            deepCopy.put(key, myMap.get(key));
        }
        return deepCopy;
    }

    public String getMyString() {
        return myString;
    }

    @Override
    public String toString() {
        return "Immutable: " +
                "myMap=" + myMap + "\nMy string is: " + myString;
    }
}
