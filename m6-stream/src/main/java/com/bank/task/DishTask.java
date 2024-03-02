package com.bank.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        // 1. Call the static method() from the DishData class
        DishData.getAll().stream()
                .filter(a -> a.getCalories() < 400)
                .map(a -> a.getName())
                .forEach(System.out::println);

        // with double clone
        DishData.getAll().stream()
                .filter(a -> a.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        // 2. Print the length of the name of each dish (to print each name we have to is a map()
        DishData.getAll().stream()
                .map(a -> a.getName())
                .map(a -> a.length())
                .forEach(System.out::println);

        // 3. print three high caloric dish names (>300)
        DishData.getAll().stream()
                .filter(a -> a.getCalories() > 300)
                .map(a -> a.getName())
                .limit(3)
                .forEach(System.out::println);


        // 4. print all dish mame that are below then 400 colorize sorted
        DishData.getAll().stream()
                .filter(a -> a.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("***********dish Type below 400  **************");
        // 5. print all dish mame that are below than 400 names and data

        DishData.getAll().stream() // you have all property from the DishData list (names of all product , type, colories)
                .filter(a -> a.getCalories() < 400) // you have excess to colories
                .sorted(Comparator.comparing(Dish::getCalories)) //
                .map(a -> a.getName()) // you now in Dish data and have excess only for names (no type, no colories)
                .forEach(System.out::println);

    }

}
