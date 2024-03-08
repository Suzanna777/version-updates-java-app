package com.bank.java10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,7,3,7,9);

        Predicate<Integer> even = i -> i % 2 == 0;
        Predicate<Integer> odd = Predicate.not(even);

        List<Integer> evenNum = list.stream()
                .filter(odd)
                .collect(Collectors.toList());
    }
}
