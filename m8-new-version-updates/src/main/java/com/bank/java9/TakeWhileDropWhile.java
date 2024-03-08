package com.bank.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {
    public static void main(String[] args) {
        List<Stock> stocks = getStocks();
        System.out.println("stock" + stocks);

        List<String> stockBelow500Filter = getStocksBelowFiveHundredFilter(stocks);
        System.out.println("filter output:" + stockBelow500Filter);

        List<String> stockBelow500 = getStocksBelowFiveHundred(stocks);
        System.out.println("filter output:" + stockBelow500);

        List<String> stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("filter out:" +stockAbove500);

    }

    public static List<String> getStocksBelowFiveHundredFilter(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("filter processing  : " + stock))
               // (className :: staticMethodName)
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }
    public static List<String> getStocksBelowFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("take while processing :" + stock))
               // when would find it the answer then would exit and stop another execution
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());

    }

    // method isStockLessThanFiveHundred()
    public static boolean isStockLessThanFiveHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500)) <= 0;
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock> stocks){
        return stocks.stream()
                // to print all stock
                .peek(stock -> System.out.println("drop while processing : " + stock) )
                // take then drop while all processes would complete
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    // method getStocks()
    private static List<Stock> getStocks(){
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("amazon", BigDecimal.valueOf(800)));
        stocks.add(new Stock("tesla", BigDecimal.valueOf(400)));
        stocks.add(new Stock("netflex", BigDecimal.valueOf(2000)));
        stocks.add(new Stock("facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("instagram", BigDecimal.valueOf(100)));
        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());
    }



        }