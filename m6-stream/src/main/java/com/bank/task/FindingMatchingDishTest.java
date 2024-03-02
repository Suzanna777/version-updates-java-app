package com.bank.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatchingDishTest {
    public static void main(String[] args) {

        System.out.println("************ allMatch Data****************");

        boolean lessCalorie = DishData.getAll().stream()
                .allMatch(a -> a.getCalories() < 1000);
        System.out.println(lessCalorie);

        System.out.println("************ Any Match Data****************");

        if(DishData.getAll().stream()
                .anyMatch(a -> a.isVegetarian())){
            System.out.println("the vegetarian menu");
        }

        System.out.println("************ noneMatch Data****************");

        boolean lessCalorie2 = DishData.getAll().stream()
                        .noneMatch(a -> a.getCalories() >= 1000);
        System.out.println(lessCalorie2);


        System.out.println("************ findAny Data****************");

       Optional<Dish> dish = DishData.getAll().stream()
                .filter(a -> a.isVegetarian())
                .findAny();
        System.out.println(dish.get());


        System.out.println("************ findFirst Data****************");

        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(a -> a.isVegetarian())
                .findFirst();
        System.out.println(dish2.get());

        System.out.println("************ parallel stream Data****************");

        System.out.println(IntStream.range(0,100)
                .parallel()
                .findAny());

        System.out.println(IntStream.range(0,100)
                .parallel()
                .findFirst());

        System.out.println("************ findFirst Data****************");

        List<String> list1 = Arrays.asList("jonny", "amina", "yusif", "ruslan", "alina");
        List<String> list2 = Arrays.asList("jonny", "rus","abika","r", "amina", "rus2" ,"rus1", "rus3","yusif", "ruslan151", "ruslan", "alina");

       Optional<String> first = list1.parallelStream()
                        .filter(a -> a.startsWith("a"))
                                .findFirst();


       Optional<String> any = list2.parallelStream()
                        .filter(a -> a.startsWith("r"))
                                .findAny();

        System.out.println(first.get());
        System.out.println(any.get());

        System.out.println("************ min comparator Data****************");

       Optional<Dish> minDish = DishData.getAll().stream()
                        .min(Comparator.comparing(a -> a.getCalories()));

        System.out.println(minDish.get());



        System.out.println("************ max comparator Data****************");

        Optional<Dish> maxDish = DishData.getAll().stream()
                .max(Comparator.comparing(a -> a.getCalories()));
        System.out.println(maxDish.get());










    }
}
