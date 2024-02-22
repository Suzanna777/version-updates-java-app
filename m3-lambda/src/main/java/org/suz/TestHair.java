package org.suz;

import java.util.ArrayList;
import java.util.List;

public class TestHair {
    public static void main(String[] args) {
        List<Hair> inventory = new ArrayList<Hair>();
        inventory.add(new Hair(14,Color.BLOND));
        inventory.add(new Hair(18, Color.BLACK));

        availablePrint(inventory, hair -> "The color of hair is " + hair.getColor() + " the link of hair is " + hair.getLink());

    }
    private static void availablePrint(List<Hair> inventory, HairFormatter hairFormatter ){
        for (Hair eachHair : inventory){
           String outPut = hairFormatter.accept(eachHair);
            System.out.println(outPut);
        }
    }
}
