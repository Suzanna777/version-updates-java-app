package com.bank;

import java.util.Arrays;
import java.util.List;

public class SteamMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,2,6,4,9,4,8,18, 23,17);
        list.stream()
                .map(a -> a * 2)
                .filter(a -> a % 3 == 0)
                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("suzanna", "alina", "home", "mama");
        list1.stream()
                .map(a -> a.length() )
                .forEach(System.out::println);

    }
}
