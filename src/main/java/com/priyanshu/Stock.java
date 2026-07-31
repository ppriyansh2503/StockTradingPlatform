package com.priyanshu;

public class Stock {

    private String companyName;
    private String symbol;
    private double price;
    private int quantity;


    // Constructor
    public Stock(String companyName, String symbol, double price) {

        this.companyName = companyName;
        this.symbol = symbol;
        this.price = price;
        this.quantity = 0;

    }


    public String getCompanyName() {

        return companyName;

    }


    public String getSymbol() {

        return symbol;

    }


    public double getPrice() {

        return price;

    }


    public void setPrice(double price) {

        this.price = price;

    }


    public int getQuantity() {

        return quantity;

    }


    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }


}