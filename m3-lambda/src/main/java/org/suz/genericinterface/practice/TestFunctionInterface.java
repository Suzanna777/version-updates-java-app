package org.suz.genericinterface.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionInterface {
    public static void main(String[] args) {
        // left side T, right side R
        Function<int[], List<Integer>> arrayToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };
        //  calling interface obj and method interface abstract apply()
        int[] nums = {5, 10, 15, 20, 30}; // T
        List<Integer> list = arrayToList.apply(nums); //  R<> objInterface. apply(T)
        System.out.println(list);
    }
}
