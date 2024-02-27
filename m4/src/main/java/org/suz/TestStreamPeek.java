package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamPeek {
    // peek() would display before the terminal operation collect
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        List<Integer> result = numbers.stream().filter(a -> a % 5 == 0).peek(a -> System.out.println(a)).collect(Collectors.toList());
        System.out.println(result);

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        nums = Arrays.stream(nums)
                .filter(a -> a % 2 == 0)
                .peek(a -> System.out.println(a))
                .toArray();
        System.out.println(Arrays.toString(nums));
    }
}
