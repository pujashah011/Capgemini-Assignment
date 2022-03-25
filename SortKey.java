package com.capgass.pack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Create Map<String, String> object and sort key in ascending order
public class SortKey {
    static void MapMethod() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "Hi");
        map.put("c", "Puja");
        map.put("b", "I'm");
        map.put("e", "Shah");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        MapMethod();

    }
}
