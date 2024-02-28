package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

        // Imperative approach: old way
        System.out.println("************Imperative approach:*************");
        List<Integer> result = new ArrayList<>();
        for (Integer each : numbers) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }
            System.out.println(result);

            System.out.println("************Declarative approach:*************");

        /* I. stream() to obtain a <stream instance> from Arr & Collection
          II. Then you can access to <intermediate operations>
        1. distinct() Returns a stream in sorted order (remove duplicates)
        2. map()
        3. peek()
        4. skip()
        5. filter()
        6. limit()
        7. sorted()
        * */
       numbers = numbers.stream().distinct().collect(Collectors.toList());
       // Terminal Operator: collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println("***************");

        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        nums = Arrays.stream(nums).distinct().toArray();
        //Terminal Operator: toArray()
        System.out.println(Arrays.toString(nums));

    }
}
