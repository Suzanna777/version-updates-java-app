package org.suz.genericinterface.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunction2Interface {
    public static void main(String[] args) {
       // <T, R>
        // (t)
        // return the functional result R apply(t)
        Function<int[], List<Integer>> arrayTOList = a -> {
            // we need to return a list of (t)
            // thus creat the list<>
            List<Integer> list = new ArrayList<>();
            // then iterate each(t)
            for (int each : a) {
                // then add each(t) to the list(R)
                list.add(each);
            }
          //  return a list
            return list;
        };

        // test
        // create arr(t)
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
       // call function interface obj and call function interface method()
        // and R assign to result
        List<Integer> result = arrayTOList.apply(numbers);
        System.out.println(result);
    }
}
