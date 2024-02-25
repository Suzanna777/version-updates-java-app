package org.suz.genericinterface.practice2;

import java.util.function.BiConsumer;

public class Test2BiConsumerInterface {
    public static void main(String[] args) {
        // no return value
        // <T, U>
        // take (t,u)

        BiConsumer<String, Integer> printMultipleTimes = (a,b) -> {
           // unknown number is less < than number u
            for (int i = 1; i < b ; i++) {
                // then print (t) until unknown number would be true
                System.out.println(a + " printed = " + i);
            }
        };
        // void accept() first argument t , u) no return value
        printMultipleTimes.accept("suzanna", 7);
    }
}
