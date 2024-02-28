package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(20, 17, 19, 10, 13, 5, 16, 3, 4, 15, 6, 18, 11, 12, 7, 8, 9, 1, 14));

        System.out.println(numbers);
        numbers = numbers.stream()
                //   .sorted()
                .map(a -> {
                    if (a % 2 == 0) {
                        return a * 10;
                    } else {
                        return a * 3;
                    }
                })
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println("************* sorted List *************");

        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(20, 17, 19, 10, 13, 5, 16, 3, 4, 15, 6, 18, 11, 12, 7, 8, 9, 1, 14));
        nums = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(nums);

        System.out.println("************* sorted array *************");

        int[] num = {20, 17, 19, 10, 13, 5, 16, 3, 4, 15, 6, 18, 11, 12, 7, 8, 9, 1, 14};
        num = Arrays.stream(num).sorted().toArray();
        System.out.println(Arrays.toString(num));
    }
}
