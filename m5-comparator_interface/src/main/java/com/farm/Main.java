package com.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 2, 3, 1, 6, 4, 7, 80, 9));
        System.out.println("************original order*****************");
        System.out.println(list);

        System.out.println("***********ascending order***********");
        // ascending order from small to large
        Collections.sort(list);
        System.out.println(list);

        System.out.println("*********My Descending made method()*********");
        // Descending order from large to small from my own method()
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        System.out.println("*********lambda Descending order********");
        Collections.sort(list, (a, b) -> (a > b) ? -1 : (a > b) ? 1 : 0);
        System.out.println(list);

        System.out.println("************Easy way ascending order************");
        // Ascending order
        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);

        System.out.println("**************** easy way Descending order ***************");
        // descending order compare (start from b to a) a compare with b
        list.sort((b, a) -> a.compareTo(b));
        System.out.println(list);
    }
}
