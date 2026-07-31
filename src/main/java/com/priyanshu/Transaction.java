package com.priyanshu;

public class Transaction {


    private String type;
    private String stockSymbol;
    private int quantity;



    // Constructor
    public Transaction(String type, String stockSymbol, int quantity) {


        this.type = type;

        this.stockSymbol = stockSymbol;

        this.quantity = quantity;


    }





    public String getType() {


        return type;


    }





    public String getStockSymbol() {


        return stockSymbol;


    }





    public int getQuantity() {


        return quantity;


    }





    // Display Transaction
    public void displayTransaction() {


        System.out.println(
                type
                        + " - "
                        + stockSymbol
                        + " - Quantity: "
                        + quantity
        );


    }


}