package org.suz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTerminalForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // terminal operation for operation result forEach(a -> sout(a))
        list.stream().filter(a -> a > 5).forEach(a -> System.out.println(a));


    }
}
