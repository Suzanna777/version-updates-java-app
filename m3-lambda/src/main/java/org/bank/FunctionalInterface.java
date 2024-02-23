package org.bank;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        // unanimous class of interface with method()
        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        System.out.println("*****PREDICATE Return True Falls*****");
        Predicate<Integer> lesserThan = i ->   i < 18;
        System.out.println(lesserThan.test(20));

        System.out.println("*****CONSUMER*****");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("******BiConsumer******");
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(10,50);

        System.out.println("******Function Return ******");
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Developer"));

        System.out.println("******BI Function Return******");
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        System.out.println(func.apply(10,30));

        System.out.println("******SUPPLIER******");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
