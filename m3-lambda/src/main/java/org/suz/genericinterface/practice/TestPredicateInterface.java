package org.suz.genericinterface.practice;

import java.util.function.Predicate;

public class TestPredicateInterface {
    public static void main(String[] args) {
        System.out.println("********Predicate isOdd or Even return True or else False********");
        Predicate<Integer> isOdd = (a) -> {
            if (a % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        boolean pr = isOdd.test(99);
        System.out.println(pr);

        System.out.println("********Predicate is Palindrome return True or else False********");
        Predicate<String> isPalindrome = (a) -> {
            String reverse = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                reverse += a.charAt(i);
            }
            return a.equalsIgnoreCase(reverse);
        };
        //  calling interface obj and method interface abstract test()
        boolean pr2 = isPalindrome.test("Wooden Spoon");
        System.out.println(pr2);
    }
}
