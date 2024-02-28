package org.bank1;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pre = a -> a % 2 == 0 ? true : false;
        boolean result = pre.test(10);
        System.out.println(result);


        System.out.println("********* Test Calculator ***********");


        System.out.println("*********call static method*********");
        // Lambda calls the = (x,y) -> ClassName .StaticMethod(x,y).
        Calculate s = (x,y) -> Calculator.findSum(x,y);
        s.calculate(2,3);

        System.out.println("************Double colon******************");
        // Double colon reference = ClassName :: StaticMethod.
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,30);

        System.out.println("*********call instance method*********");
        // create new class obj
        Calculator obj = new Calculator();
        // Double colon reference = objName :: instanceMethod()
        Calculate s3 = obj ::findMultiply;
        s3.calculate(10,20);
        System.out.println(s3);

        System.out.println("*********BiFunction <T,U,R>; R(t,u) *********");
        // long way
        BiFunction<String, Integer, String> biFun1 = (a,b) -> a.substring(b);
        BiFunction<String, Integer,String> biFun2= String :: substring;

        // <T, R> Calling a instance method()
        Function<Integer, Double> res = new MyClass() :: method;

        System.out.println("*************BiFunction************");
        // <T>  (t) no return print
        // <TC,U,R>; R(t,u)
        BiFunction<MyClass, Integer, Double> res2 = MyClass :: method;

        System.out.println("*************Consumer************");
        // <T>  (t) no return print
        Consumer<Integer> display  = a -> System.out.println(a);
        Consumer<Integer> display2 = System.out :: println;

    }

}
