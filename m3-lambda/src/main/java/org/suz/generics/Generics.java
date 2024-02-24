package org.suz.generics;

import java.util.List;

public class Generics <T>{
   // static method with generic Type
    public static <T> void printEach(T[] t){
        for (T each : t) {
            System.out.println(each);
        }
    }

    public static <T> void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);
        } 
    }
   // Instant method
    public void printEachInstant(T[] t){
        for (T each : t) {
            System.out.println(each);
        }
    }
    public void printEachInstant(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }
}
