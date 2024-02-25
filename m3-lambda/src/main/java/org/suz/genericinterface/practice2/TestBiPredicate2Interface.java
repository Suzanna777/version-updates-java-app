package org.suz.genericinterface.practice2;

import java.util.function.BiPredicate;

public class TestBiPredicate2Interface {
    public static void main(String[] args) {
        // (T, U)
        // Parameter: (t, u) argument t, u
        // return: true or false if u contain in Type t
        // boolean test(t,u) two argument (t and give u second argument)
        BiPredicate<int[], Integer> contains = (a, b) -> {
            // iterate each t
            for (int each : a) {
                // if each t == u
                if (each == b) {
                    return true;  // then return
                }
            }
            return false;
        };
        int[] result = {1, 20, 30, 50, 60, 70, 80, 90, 100};
        boolean r = contains.test(result, 100);
        System.out.println(r);
    }
}
