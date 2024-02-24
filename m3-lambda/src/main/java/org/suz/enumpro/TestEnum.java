package org.suz.enumpro;

import java.util.Arrays;

public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        // switch statement
        switch (day){
            case MONDAY:
                System.out.println("it is Monday");
                break;
            case TUESDAY:
                System.out.println("it is Tuesday");
        }

        Day[] weekdays = Day.values();
        System.out.println(Arrays.toString(weekdays));
    }
}
