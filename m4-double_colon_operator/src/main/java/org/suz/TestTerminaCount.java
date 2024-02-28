package org.suz;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestTerminaCount {
    // Terminal operator count()
    public static void main(String[] args) {

        long n = Stream.of(1,2,3,4,5,6,7,8,9).count();
        System.out.println(n);

        String[] words = {"java", "suzanna", "java",  "java", "amina"};
        long c = Arrays.stream(words).filter(a -> a.equals("java")).count();
        System.out.println(c);
    }
}
