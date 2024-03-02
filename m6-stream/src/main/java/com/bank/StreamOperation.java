package com.bank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.forEach(System.out::println);

        System.out.println("************filter is equal to if()******************");

        List<Integer> list2 = Arrays.asList(3, 2, 4,4,3,3,2, 8, 7, 9, 9, 3, 4, 11, 5, 6, 1);
        list2.stream()
                .filter(a -> a % 2 == 0) // intermediate operator
                .forEach(System.out::println); // terminal operator


        System.out.println("********** distinct remove duplicate **********");

        List<Integer> list3 = Arrays.asList(3, 2, 2, 4, 4,8, 7,7,7,7, 9, 3, 4, 1, 5, 6, 1);
        Stream<Integer> str = list3.stream()
                .filter(a -> a % 2 == 0)
                .distinct();
        str.forEach(System.out::println);

        System.out.println("********** limit() the size intermediate operator **********");

        List<Integer> list4 = Arrays.asList(3, 2, 2, 4, 4,8, 7,7,7,7, 9, 3, 4);
        list4.stream()
                .filter(a -> a%2 ==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("************** skip() the given index and continue to the next*************");
        List<Integer> list5 = Arrays.asList(1,4,6,3,8,9,6,9,8,4,5,4,3);
        list5.stream()
                .filter(a -> a%2 == 0) // same as if(condition)
                .skip(1) // skip this index and cont
                .distinct() // remove duplicate
                .forEach(System.out::println);

    }
}
