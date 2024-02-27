package org.suz.genericinterface.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Test2BiFunctionInterface {
    public static void main(String[] args) {
        //  BiFunction <T, U, R> -> (t,u){
        // T first argument; U second argument;
        // R return the function result of (t and u)
        // Return  R apply(t, u) }

        BiFunction<int[], int[], List<Integer>> addTwoArrayToList = (a, b) -> {
            // create the list
            // then iterate the arr a and b
            // then add each arr to the list
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            // then return R
            return list;
        };

        // create the arr a and arr b
        int[] arr1 = {10, 20, 30, 40, 100};
        int[] arr2 = {50, 60, 70, 80, 90};
        // call the biFunction obj and method apply(t,u) and assign (t,u) to the R
        List<Integer> result = addTwoArrayToList.apply(arr1, arr2);

        System.out.println(result);

        System.out.println("**********BiFunction***********");

        // < T U R > return result of R (t,u)
        BiFunction<int[], int[], List<Integer>> ListAdd2Arr = (a, b) -> {
            // create a List
            List<Integer> list = new ArrayList<>();
            // iterate the BiFunction a arr
            for (int each : a) {
                // then list add biFunction arr a and b
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            return list;
        };

        // test the arr a and arr 2
        int[] arr3 = {20, 30, 40, 50};
        int[] arr4 = {60, 70, 80, 90, 100, 200, 300, 400, 500};
        // then call biFunction obj and biFunction given method apply(t,u) and assign back to R
        List<Integer> result2 = addTwoArrayToList.apply(arr3, arr4);
        System.out.println(result2);

        System.out.println("**********BiFunction************");

        // <T U R> assign (t u) to R and return only R

        BiFunction<int[], int[], List<Integer>> listOfArr = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            // iterate arr a and arr b
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            return list;
        };

        int[] arr5 = {10, 20, 30, 40, 50};
        int[] arr6 = {60, 70, 80, 90, 100};
        List<Integer> result3 = listOfArr.apply(arr5, arr6);
        System.out.println(result3);

        BiFunction<String[], String[], List<String>> addArrStrToList = (a,b) -> {
            List<String> list = new ArrayList<>();
            for (String each : a) {
                list.add(each);
            }
            for (String each : b) {
                list.add(each);
            }
             return list;
        };
        String[] str1 = {"mama", "ruslan", "alina", "suzanna"};
        String[] str2 = {"yusif", "family"};
       List<String> resultStr = addArrStrToList.apply(str1, str2);
        System.out.println(resultStr);
    }
}
