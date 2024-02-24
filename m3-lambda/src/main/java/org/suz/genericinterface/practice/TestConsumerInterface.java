package org.suz.genericinterface.practice;

import java.util.function.Consumer;

public class TestConsumerInterface {
    public static void main(String[] args) {

        Consumer<int[]> printEach = (arr) -> {
            for (int each : arr) {
                System.out.println(each);
            }
        };
        //  calling interface obj and method interface abstract accept()
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printEach.accept(arr);
    }
}
