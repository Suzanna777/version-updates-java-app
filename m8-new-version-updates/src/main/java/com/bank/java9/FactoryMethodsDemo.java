package com.bank.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {
        // create unmodifiable List before
        List<String> courses = Collections.unmodifiableList(Arrays.asList("java", "Spring", "agile"));
//        courses.add("TS");
        System.out.println(courses);

      //  create unmodifiable after Java9
        List<String> myCourses = List.of("java", "spring", "agile");

        Set<String> myProducts = Set.of("milk", "butter");
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("samsung tv", 1),
                Map.entry("ps", 1),
                Map.entry("chair", 5)
        );



    }
}
