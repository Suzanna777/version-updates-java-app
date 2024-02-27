package org.suz;

import java.util.Arrays;

public class TestTerminalOpReduce {

    // reduce() combine all value and bring result
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        String[] st = {"java", "developer", "reach"};
        String st1 = Arrays.stream(st).reduce(" ", (a, b) -> a + " " + b);

        System.out.println(st1);
    }
}
