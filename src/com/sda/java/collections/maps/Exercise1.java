package com.sda.java.collections.maps;

import java.lang.reflect.Array;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Person p1 = new Person("hatef", "palizgar", 32);
        Person p2 = new Person("Adam", "Smith", 25);

        Friend f1 = new Friend("John", "Doe", 22);
        Friend f2 = new Friend("Mary", "Abraham", 40);

        Map<Person, Friend> map = new HashMap<>();

        // add some entry to the map
        map.put(p1, f1);
        map.put(p2, f2);

        // add duplicate key (NOT POSSIBLE) - new entry will override the previous entry
//        map.put(p1, f2);

/*
        for (Map.Entry<Person, Friend> entry : map.entrySet()) {
            System.out.println("person: " + entry.getKey().toString() + " friend: " + entry.getValue().toString());
        }

        System.out.println(map.get(p1));

        System.out.println(map.containsKey(p1));

        for (Friend value : map.values()) {
            System.out.println(value.toString());
        }*/

        Map<Person, List<Friend>> partyPeople = new HashMap<>();

        partyPeople.put(p1, Arrays.asList(f1, f2));
        partyPeople.put(p2, Arrays.asList(f1, f2));

        for (Map.Entry<Person,List<Friend>> p : partyPeople.entrySet()) {
            for (Friend f : p.getValue()) {
                System.out.println(p.getKey().getFirstName() +": \n"+ f.getFirstName() + " " + f.getLastName() + " " + f.getAge());
            }
        }

    }

}
