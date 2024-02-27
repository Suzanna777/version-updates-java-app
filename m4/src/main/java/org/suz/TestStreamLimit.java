package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamLimit {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 40, 500));

        System.out.println("**********Stream Limit max size to print*************");
        numbers = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println(numbers);

        int[] nums = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        nums = Arrays.stream(nums).limit(5).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
