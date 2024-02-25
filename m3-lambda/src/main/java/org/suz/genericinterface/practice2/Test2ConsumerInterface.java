package org.suz.genericinterface.practice2;

import java.util.function.Consumer;

public class Test2ConsumerInterface {

    public static void main(String[] args) {
        // to print all element
        //Consumer <T> argument
        // void accept(t) input argument
        // no return value and no passing

        Consumer<int[]> printEachElement = a -> {
            for (int each : a) {
                System.out.println(each);
            }
        };

        int[] a = {10,20,30};
        printEachElement.accept(a);

        Consumer<String[]> strEach = str -> {
            for (String each : str) {
                System.out.println(each);
            }
        };
        String[] word = {"hello developer", "I am a developer"};
        strEach.accept(word);
    }
}
