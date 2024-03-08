package com.bank;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,3,7);
        Optional<String> empty = Optional.empty();
 //       System.out.println(empty);
//        System.out.println(empty.isPresent());


        //isPresent()
 //       System.out.println(Optional.of(numbers).isPresent());

        // ifPresent
       Optional<Integer> bigNum = numbers.stream()
               .filter(a -> a > 100)
               .findAny();
       bigNum.ifPresent(System.out::println);

       //get
 //       System.out.println(bigNum.get());

        // orElse
        System.out.println(bigNum.orElse(5));


    }
}