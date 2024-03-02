package com.bank;

import com.bank.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,2,8,4,9);
        int sum = 0;
        for (Integer each : numbers) {
            sum = sum + each;
        }

        System.out.println(sum);


        System.out.println("********* reduce  return result*********");

       int result = numbers.stream()
                .reduce(0,(a,b) -> a + b );

        System.out.println(result);

        System.out.println("********* reduce() would return dish total result of colories *********");

       int res = DishData.getAll().stream()
                .map(a ->a.getCalories())
                .reduce( (a,b) -> a + b)
               .get();
        System.out.println(res);


        System.out.println("********* reduce() return min *********");

        Optional<Integer> resultMin = numbers.stream()
                .reduce(Integer::min);
        System.out.println("min " +resultMin.get());

        System.out.println("********* reduce() return max *********");

        int resultMax = numbers.stream()
                .reduce(Integer::max)
               .get();
        System.out.println("max " + resultMax);


        System.out.println("************* count ************");

        long dishCount = DishData.getAll().stream()
                        .count();
        System.out.println(dishCount);

        System.out.println("*************************");


        System.out.println("*************************");



    }
}
