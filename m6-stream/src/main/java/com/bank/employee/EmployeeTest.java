package com.bank.employee;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeData.readAll()
                .map(a -> a.getEmpEmail()) // print only email from the data
                .forEach(System.out::println);


        // print all phone number
        EmployeeData.readAll()
            //    .map(a -> a.getEmpPhoneNumbers()) Map only one-to-one would not work is you have 2 numbers
                .flatMap(a -> a.getEmpPhoneNumbers().stream()) // flat map would return 2 phone number
                // (stream of :: stream) ( T :: stream() but without ()
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream) // same as lambda (Type :: stream)
                .forEach(System.out::println);
    }
}
