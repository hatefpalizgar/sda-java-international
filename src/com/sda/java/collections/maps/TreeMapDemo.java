package com.sda.java.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 200);
        treeMap.put(4, 400);
        treeMap.put(1, 100);
        treeMap.put(3, 300);
        // Null values are not allowed for TreeMap
        //treeMap.put(null, null);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

}
