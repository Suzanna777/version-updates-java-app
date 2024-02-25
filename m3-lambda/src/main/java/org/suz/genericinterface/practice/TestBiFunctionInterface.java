package org.suz.genericinterface.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class TestBiFunctionInterface {

    public static void main(String[] args) {
        //  BiFunction <T, U, R> -> (t,u){
        // T first argument; U second argument; R return the function result of (t and u)
        // Return  R apply(t, u) }
        BiFunction<int[], int[], List<Integer>> mergeTwoArray = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            return list;
        };
        // 1. creating arr1 and arr2
        // 2. calling interface obj and method interface abstract: R .apply(T,U)
        int[] arr1 = {5, 7, 8, 9, 10, 11};
        int[] arr2 = {100, 200, 300, 400, 500};

        List<Integer> result = mergeTwoArray.apply(arr1, arr2);
        System.out.println(result);
    }
}
