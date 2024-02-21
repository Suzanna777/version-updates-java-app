package com.bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("The git project");
        System.out.println("How to access to constant");
        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println(" access to all Enum");
        Currency[] currencies = Currency.values(); // TCA[]  OEA
        for (Currency currency : currencies){ // TC OEC
            System.out.println(currency);
        }

        System.out.println("How to use switch case with enum");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("1 cent");
                break;
            case NICKLE:
                System.out.println("5 cent");
                break;
            case DIME:
                System.out.println("10 cent");
                break;
            case QUARTER:
                System.out.println("25 cent");
                break;


        }

        System.out.println("Operation task with Enum");
        calculate(3, 5, Operation.PLUS );


        System.out.println("How to retrieve the constant value From the Enum class ");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());

        System.out.println("How to know the index number of the constant enum");
        System.out.println(Currency.QUARTER.ordinal());
    }
    // METHOD
    private static void calculate(double x, double y, Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
        }

    }
}