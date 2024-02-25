package org.suz.genericinterface.practice;

import java.util.function.BiPredicate;

public class TestBiPredicateInterface {

    public static void main(String[] args) {
        // <T, U>;
        // boolean test(T t, U u)
        BiPredicate<int[], Integer> contains = (a, b) -> {
            for (int each : a) {
                if (each == b) {
                    return true;
                }
            }
            return false;
        };
        //   calling interface obj and method interface abstract test()
        int[] nums = {100, 200, 300, 400};
        boolean pr = contains.test(nums, 600);
        System.out.println(pr);
    }
}
