package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestTerminalOperator {
    // 1. stream
    // 2. intermediate operation
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("java", "developer",
                "wooden spoon", "book", "reach", "home"));
        Set<String> result = words.stream().filter(a -> a.startsWith("j")).collect(Collectors.toSet());
        words = words.stream().filter(a -> a.startsWith("b")).collect(Collectors.toList());

        System.out.println(result + " Set ");

        System.out.println(words + " List");

        //
        String[] ws = {"java", "suzanna", "book"};
         Arrays.stream(ws).filter(a -> a.startsWith("s")).forEach(a -> System.out.println(a));


    }
}
