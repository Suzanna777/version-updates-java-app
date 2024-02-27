package org.suz;

import java.util.Arrays;

public class TestTerminalMatch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
         boolean r1 = Arrays.stream(nums).allMatch(a -> a < 10 );
        System.out.println(r1);

        System.out.println("************any Match*************");
        // if predicate has OddNumber
        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        boolean r2 =Arrays.stream(nums2).anyMatch(a ->  a % 2 != 0 );


        System.out.println(r2);

        System.out.println("************none Match***************");
        // if any element is Not matching with this condition
        int[] nums3 = {1,2,3,4,5,6,7,8,9, 10, 11};
        boolean r3 = Arrays.stream(nums3).noneMatch(a -> a > 10);
        System.out.println(r3);
    }
}
