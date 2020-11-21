package com.sda.java.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        Country estonia = new Country("Estonia");
        Country finland = new Country("Finland");
        Country turkey = new Country("Turkey");
        Country japan = new Country("Japan");

        // old way
        Country[] countries = new Country[]{estonia,finland,turkey};
        // disadvantage: normal array is of fixed size

        // using Collections
        List<Country> countryList = new ArrayList<>();
        countryList.add(estonia);
        countryList.add(finland);
        countryList.add(turkey);


//        for (Country c : countryList) {
//            System.out.println(c.getName())
//        }

        Iterator<Country> countryIterator = countryList.iterator();

        while (countryIterator.hasNext()) {
            System.out.println(countryIterator.next().getName());
        }
    }
}
