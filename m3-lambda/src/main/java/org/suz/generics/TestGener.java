package org.suz.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGener {
    public static void main(String[] args) {

        System.out.println("*********Array********");

        Integer[] numbers = {10,20,30,40};
        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] characters = {'A', 'B', 'C','D', 'E'};
        String[] words = {"java", "programmer", "job", "developer"};

        System.out.println("*********Calling Array static method********");

        // Calling the static method
        Generics.printEach(numbers);
        Generics.printEach(decimals);
        Generics.printEach(characters);
        Generics.printEach(words);

        System.out.println("*******Calling Static List method**********");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50));
        Generics.printEach(list);

        List<Double> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1.5, 2.5, 3.5, 4.5));
        Generics.printEach(list1);

        System.out.println("*******Calling Instance Method**********");

        // 1. create obj to class
        // 2. obj .instanceMethodName(arrObjName)
        Generics<Integer> obj = new Generics<>();
        obj.printEachInstant(numbers);

        Generics<Double> obj1 = new Generics<>();
        obj1.printEachInstant(decimals);

        Generics<Double> obj2 = new Generics<>();
        obj2.printEachInstant(list1);

    }
}
