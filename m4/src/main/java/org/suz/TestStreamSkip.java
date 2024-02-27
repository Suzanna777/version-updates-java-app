package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamSkip {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        numbers = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(numbers);

        //Terminal Operator: toArray()
        int[] nums = {100, 200, 300, 400, 500};
        nums = Arrays.stream(nums).skip(2).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
