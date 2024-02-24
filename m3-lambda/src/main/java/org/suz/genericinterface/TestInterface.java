package org.suz.genericinterface;

public class TestInterface {
    public static void main(String[] args) {
        MyFunction<Integer> displayCube = (a) -> {
            System.out.println(a * a * a);
        };
        displayCube.function(100);

        System.out.println("********String*********");

        // 1. if we have only 1 value then nobody need and no parenthesis
        MyFunction<String> displayThirdCharacter = a -> System.out.println("displaying third character: " + a.charAt(2));
        displayThirdCharacter.function("Suzanna");


    }
}
