package com.priyanshu;

import java.util.ArrayList;

public class Market {


    private ArrayList<Stock> stocks;



    // Constructor
    public Market() {


        stocks = new ArrayList<>();


        stocks.add(new Stock("Apple", "AAPL", 200.5));

        stocks.add(new Stock("Tesla", "TSLA", 320.75));

        stocks.add(new Stock("Google", "GOOG", 180.25));


    }





    // Display Market Stocks
    public void displayMarketStocks() {


        System.out.println("\n===== MARKET STOCKS =====");


        for(Stock stock : stocks) {


            System.out.println(
                    stock.getCompanyName()
                            + " ("
                            + stock.getSymbol()
                            + ") - $"
                            + stock.getPrice()
            );


        }


    }





    // Find Stock By Symbol
    public Stock findStock(String symbol) {


        for(Stock stock : stocks) {


            if(stock.getSymbol().equalsIgnoreCase(symbol)) {


                return stock;


            }


        }


        return null;


    }





    // Update Stock Price
    public void updateStockPrice(String symbol, double newPrice) {


        Stock stock = findStock(symbol);



        if(stock != null) {


            stock.setPrice(newPrice);


            System.out.println(
                    "Stock Price Updated Successfully!"
            );


        }
        else {


            System.out.println(
                    "Stock Not Found!"
            );


        }


    }


}