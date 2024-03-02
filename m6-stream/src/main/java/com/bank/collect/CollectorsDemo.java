package com.bank.collect;

import com.bank.task.Dish;
import com.bank.task.DishData;
import com.bank.task.Type;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 2, 6, 4, 8, 7, 9);

        List<Integer> listNumbers = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listNumbers);

        System.out.println("************** counting()*****************");

        Set<Integer> setNumbers = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(setNumbers);

        System.out.println("************** counting()*****************");

        List<Integer> listNums = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("************** toSet()*****************");

        Set<Integer> setNums = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println("************** toMap()*****************");

        Map<String, Integer> dishMap = DishData.getAll().stream()
                //      .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
                .collect(Collectors.toMap(a -> a.getName(), a -> a.getCalories()));

        System.out.println(dishMap);

        System.out.println("**************summingInt()*****************");

        Integer sum = DishData.getAll().stream()
                //   .collect(Collectors.summingInt(Dish::getCalories));
                .collect(Collectors.summingInt(a -> a.getCalories()));
        System.out.println();

        System.out.println("************** counting() example: even count*****************");

        Long evenCount = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        System.out.println("************** averagingInt()*****************");

        Double averageCount = DishData.getAll().stream()
                //     .collect(Collectors.averagingInt(Dish::getCalories));
                .collect(Collectors.averagingInt(a -> a.getCalories()));
        System.out.println(averageCount);

        System.out.println("************** joining()*****************");

        List<String> course = Arrays.asList("java", "javaScript", "C#");
        String str = course.stream()
                .collect(Collectors.joining(","));


        System.out.println("**************partitioningBy()*****************");

       Map<Boolean, List<Dish>> vegiDish = DishData.getAll().stream()
             //           .collect(Collectors.partitioningBy(Dish::isVegetarian));
                     .collect(Collectors.partitioningBy(a -> a.isVegetarian()));
        System.out.println(vegiDish);

        System.out.println("************** groupingBy()*****************");

        // Map<K, List<T>>
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
