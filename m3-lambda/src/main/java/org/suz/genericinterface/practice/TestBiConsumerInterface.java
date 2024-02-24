package org.suz.genericinterface.practice;

import java.util.function.BiConsumer;

public class TestBiConsumerInterface {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printMultipleTimes = (a, b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };
        //  calling interface obj and method interface abstract accept() by obj with 2 arguments
        printMultipleTimes.accept("wooden spoon" , 7);
    }
}
