package org.bank1;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestCar {
    public static void main(String[] args) {
        // zero argument const
        //<TC> ()
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // one argument const <T, R> (t)
        Function<Integer, Car> f1 = a -> new Car(a);
        Function<Integer, Car> f2 = Car::new;

        // two argument const <T, U, R> return R(t,u)
        BiFunction<String, Integer, Car> f3 = Car::new;
        Car honda = f3.apply("honda", 2015);
        System.out.println(honda.getModel() + " " + honda.getMake());

    }
}
