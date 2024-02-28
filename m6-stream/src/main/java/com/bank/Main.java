package com.bank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("**********array stream*********");

        String[] courses = {"java", "spring", "agile"};
        Stream<String> streamCourse = Arrays.stream(courses);

        System.out.println("*********List stream********");
        List<String> list = Arrays.asList("java", "sprint", "agile");
        Stream<String> courseStream2 = list.stream();


        List<Course> myListCourse = Arrays.asList(
                new Course("java", 01),
                new Course("DS", 02),
                new Course("AI", 03)
        );
        Stream<Course> myCourseStream = myListCourse.stream();

    }

}
