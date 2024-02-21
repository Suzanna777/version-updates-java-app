package com.bank.task;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        Integer[] s = {1,2,2,4};
        swap(s,0,2);
        System.out.println(Arrays.toString(s));

    }
    // void method swap  - not return value
    private static <T> void swap(T[]s, int a, int b){

        T temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
