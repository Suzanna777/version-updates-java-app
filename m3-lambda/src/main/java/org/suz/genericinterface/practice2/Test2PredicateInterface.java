package org.suz.genericinterface.practice2;

import java.util.function.Predicate;

public class Test2PredicateInterface {

    public static void main(String[] args) {
        // Is good to use if you have to compare predicate and given number
        // Predicate <T> return method Type boolean
        // (t) 1 argument parameter;
        // return true if (code is correct)
        // otherwise return false
        // boolean test(t)

        Predicate<Integer> isOddNumber = a -> {
            if (a % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };
        boolean result = isOddNumber.test(15);
        System.out.println(result + " is Odd number");


        Predicate<String> isPalindrome = a -> {
            // empty string reverse
            String reverse = "";
            // iterate from the last to the firs
            for (int i = a.length() - 1; i >= 0; i--) {
                reverse += a.charAt(i);
            }
            return a.equalsIgnoreCase(reverse);
        };
        // test the predicate method()
        boolean result2 = isPalindrome.test("Madam");
        System.out.println(result2 + " is Palindrome?");

        System.out.println("*********is OddNumber***********");

        Predicate<Integer> isOddNumber2 = a -> {
            // if predicate a can % 2 == 0
            if (a % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };

        boolean num = isOddNumber2.test(10);
        System.out.println(num + " is OddNumber?");

        Predicate<Integer> isEven = a -> {
            if (a % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        boolean even = isEven.test(22);
        System.out.println(even + " is Even?");

        System.out.println("*********Palindrome***********");

        Predicate<String> isPalindrome2 = a -> {
            // 1. crate empty str
            String empty = "";
            // 2. iterate the predicate a
            for (int i = a.length() - 1; i >= 0; i--) {
                // 3. passing every i to the empty str
                empty += a.charAt(i);
            }
            // return with compare a predicate with given empty string
            return a.equalsIgnoreCase(empty);
        };
        // boolean return type
        boolean result3 = isPalindrome2.test("Mom");
        System.out.println(result3 + " is Palindrome");

        Predicate<String> isPalindrome3 = a -> {
            // create empty backed
            String empty2 = "";
            // iterate the predicate a from last to the first
            for (int i = a.length() - 1; i >= 0; i--) {
                // assign predicate a to every i and after pass to the empty string
                empty2 += a.charAt(i);
            }
            // return predicate a is equal to comparing string
            return a.equalsIgnoreCase(empty2);
        };
        // boolean return type
        boolean word = isPalindrome3.test("Civic");
        System.out.println(word + " is Palindrome3");

        System.out.println("*********Palindrome***********");

        Predicate<String> palindrome4 = a -> {
            String empty3 = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                empty3 += a.charAt(i);
            }
            return a.equalsIgnoreCase(empty3);
        };

        boolean word2 = palindrome4.test("madam");
        System.out.println(word2 + " is palindrome4?");
    }
}
