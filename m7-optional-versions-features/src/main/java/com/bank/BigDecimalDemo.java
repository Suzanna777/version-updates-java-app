package com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2); // wrong

        // class BigDecimal and creating a new class
        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");

        // class BigDecimal has a static method valueOf()
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;

        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(new BigDecimal("15.02")));

        BigDecimal number1 = new BigDecimal("23.55");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));

        // do not use equals() use compareTo()
        System.out.println(new BigDecimal("1")
                .compareTo(new BigDecimal("2")));

        System.out.println(new BigDecimal("3")
                .compareTo(new BigDecimal("2")));

        System.out.println(new BigDecimal("1")
                .compareTo(new BigDecimal("2")));

    }
}
