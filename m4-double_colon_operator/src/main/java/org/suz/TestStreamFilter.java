package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(numbers);
        numbers = numbers.stream()
                .filter(a -> a % 2 == 0) // filter all (a) if a == 0) otherwise would skip
                .map(a -> a * 10) // remain a would multiplier by 10
                .collect(Collectors.toList()); // then collect to list
        System.out.println(numbers);
    }
}
