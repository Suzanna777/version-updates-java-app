package com.farm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class TestApple {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(250, Color.GREEN));
        inventory.add(new Apple(400, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(150, Color.RED));
        inventory.add(new Apple(50, Color.RED));
        // static method comparing()
        // Comparator <T> name = Comparator class and method comparing (T u) -> u get with and compare with T
        Comparator<Apple> sortApple = comparing((Apple a) -> a.getWight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        System.out.println("*************easy way to compare with double comparator***********");

        Comparator<Apple> sortApple2 = comparing(Apple::getWight);
        inventory.sort(sortApple2);
        System.out.println(inventory);

        System.out.println("*************MORE easy way to sort(from small to large ) and compare( with double Colon operator)***********");

        inventory.sort(comparing(Apple::getWight));
        System.out.println(inventory);

        System.out.println("*************MORE easy way to compare and reversed from large to small with double Colon operator***********");

        inventory.sort(comparing(Apple:: getWight).reversed());
        System.out.println(inventory);

    }
}
