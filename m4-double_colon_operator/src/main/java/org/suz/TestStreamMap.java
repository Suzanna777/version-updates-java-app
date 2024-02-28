package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamMap {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(numbers);
        // Function interface <T, R> (r) -> { if(r operation) return r *2 else {return r *10
        numbers = numbers.stream().map(a -> {
            if (a % 2 == 0) {
                return a * 3;
            } else {
                return a * 10;
            }
        } ).collect(Collectors.toList());
        System.out.println(numbers);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        nums = Arrays.stream(nums).map(a -> {
            if (a % 2 == 0) {
                return a * 10;
            } else {
                return a * 3;
            }
        }).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
