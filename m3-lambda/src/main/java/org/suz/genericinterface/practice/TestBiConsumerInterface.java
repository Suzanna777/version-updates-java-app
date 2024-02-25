package org.suz.genericinterface.practice;

import java.util.function.BiConsumer;

public class TestBiConsumerInterface {
    public static void main(String[] args) {
       // (T, U); type of the first argument and the second argument
        // void accept( t,  u) argument
        BiConsumer<String, Integer> printMultipleTimes = (a, b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };
        //  calling interface obj and method interface abstract accept() by obj with 2 arguments
        printMultipleTimes.accept("wooden spoon" , 7);
    }
}
