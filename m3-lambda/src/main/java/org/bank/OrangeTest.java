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


    }
    // Method
    private static void prettyPrentApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
       for (Orange eachOrange : inventory){
          String output =  orangeFormatter.accept(eachOrange);
           System.out.println(output);

       }
    }
}
