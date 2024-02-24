package org.suz.genericinterface.practice;

public class TestMyFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface cube = (a) -> {
            System.out.println(a * a * a);
        } ;
        // calling an interface abstract method() by obj
        cube.test(10);

        System.out.println("******OddEven********");

        MyFunctionalInterface oddEven = (a) -> {
            if(a % 2 == 0){
                System.out.println(a + " is even");
            }else {
                System.out.println(a + " is odd");
            }
        };
        // obj call the interface abstract method()
        oddEven.test(15);
        oddEven.test(20);
    }

}
