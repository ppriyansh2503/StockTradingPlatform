package com.priyanshu;

import java.util.ArrayList;

public class Portfolio {


    ArrayList<Stock> myStocks;

    ArrayList<Transaction> transactions;
    FileManager fileManager;



    // Constructor
    public Portfolio() {


        myStocks = new ArrayList<>();

        transactions = new ArrayList<>();
        fileManager = new FileManager();


    }




    // Buy Stock
    public void buyStock(Stock stock, int quantity) {


        for(Stock s : myStocks) {


            if(s.getSymbol().equalsIgnoreCase(stock.getSymbol())) {


                s.setQuantity(s.getQuantity() + quantity);


                transactions.add(
                        new Transaction(
                                "BUY",
                                stock.getSymbol(),
                                quantity
                        )
                );

                fileManager.saveTransaction(
                        new Transaction(
                                "BUY",
                                stock.getSymbol(),
                                quantity
                        )
                );


                System.out.println(
                        stock.getCompanyName()
                                + " purchased successfully."
                );


                return;


            }


        }



        stock.setQuantity(quantity);


        myStocks.add(stock);



        transactions.add(
                new Transaction(
                        "BUY",
                        stock.getSymbol(),
                        quantity
                )
        );



        System.out.println(
                stock.getCompanyName()
                        + " purchased successfully."
        );


    }






    // Sell Stock
    public void sellStock(String symbol, int sellQuantity) {



        for(Stock stock : myStocks) {



            if(stock.getSymbol().equalsIgnoreCase(symbol)) {



                if(sellQuantity <= stock.getQuantity()) {



                    stock.setQuantity(
                            stock.getQuantity() - sellQuantity
                    );



                    transactions.add(
                            new Transaction(
                                    "SELL",
                                    symbol,
                                    sellQuantity
                            )
                    );

                    fileManager.saveTransaction(
                            new Transaction(
                                    "SELL",
                                    symbol,
                                    sellQuantity
                            )
                    );



                    System.out.println(
                            stock.getCompanyName()
                                    + " sold successfully."
                    );



                    if(stock.getQuantity() == 0) {

                        myStocks.remove(stock);

                    }



                    return;


                }
                else {


                    System.out.println(
                            "Not enough quantity available!"
                    );


                    return;


                }



            }



        }



        System.out.println(
                "Stock Not Found In Portfolio!"
        );


    }







    // Display Portfolio
    public void displayPortfolio() {


        System.out.println("\n===== YOUR PORTFOLIO =====");



        if(myStocks.isEmpty()) {


            System.out.println("Portfolio Empty!");

            return;


        }



        for(Stock stock : myStocks) {


            System.out.println(
                    stock.getCompanyName()
                            + " ("
                            + stock.getSymbol()
                            + ")"
            );


            System.out.println(
                    "Quantity: "
                            + stock.getQuantity()
            );


            System.out.println(
                    "Price: $"
                            + stock.getPrice()
            );


            System.out.println("-------------------");


        }


    }







    // Profit Loss
    public void calculateProfitLoss() {


        double total = 0;



        for(Stock stock : myStocks) {


            total += stock.getPrice()
                    *
                    stock.getQuantity();


        }



        System.out.println("\n===== PROFIT / LOSS =====");


        System.out.println(
                "Current Portfolio Value: $"
                        + total
        );


    }







    // Transaction History
    public void displayTransactions() {


        System.out.println("\n===== TRANSACTION HISTORY =====");



        if(transactions.isEmpty()) {


            System.out.println("No Transactions!");

            return;


        }



        for(Transaction t : transactions) {


            t.displayTransaction();


        }



    }



}