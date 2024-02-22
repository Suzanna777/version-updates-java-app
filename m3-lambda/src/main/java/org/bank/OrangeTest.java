package org.bank;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        // creating the list of Orange and add new Orange to the list
        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.ORANGE ));
        inventory.add(new Orange(200, Color.RED));
        inventory.add(new Orange(100, Color.ORANGE));

        // Calling the method with lambda
        // 1. Interface obj = OCE -> "An orange" + OCE .getVariable
        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrentApple(inventory,orangeLambda);

        System.out.println("**********************");

        // Calling this way
        // 1. methodName( OLE, OCE -> OCE .getVariable
        prettyPrentApple(inventory, orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("**********************");

        // If lambda more than one line
        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight() > 200? "Heavy" : "Light";
            return "A" + ch + " " + orange.getColor() + "Orange";
        };
        prettyPrentApple(inventory, fancyFormatter );
    }
    // Method
    private static void prettyPrentApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
       for (Orange eachOrange : inventory){
          String output =  orangeFormatter.accept(eachOrange);
           System.out.println(output);

       }
    }
}
