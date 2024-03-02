package com.bank.employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(01, "suzanna", "suz@gmial.com", Arrays.asList("145382", "128649")),
                new Employee(02, "aliana", "alina@gmial.com", Arrays.asList("145338282", "128572649")),
                new Employee(03, "ruslan", "rus@gmial.com", Arrays.asList("1453829632", "1286689349")),
                new Employee(04, "amina", "amina@gmial.com", Arrays.asList("145387204382", "12867893049"))

        );
    }
}
