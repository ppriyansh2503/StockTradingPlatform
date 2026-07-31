package com.priyanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Market market = new Market();
        Portfolio portfolio = new Portfolio();

        int choice;


        do {

            System.out.println("\n===== STOCK MANAGEMENT SYSTEM =====");
            System.out.println("1. View Market Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Show Profit/Loss");
            System.out.println("6. Update Stock Price");
            System.out.println("7. Transaction History");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();


            switch(choice) {


                case 1:
                    market.displayMarketStocks();
                    break;


                case 2:

                    market.displayMarketStocks();

                    System.out.print("\nEnter Stock Symbol: ");
                    String symbol = sc.next();


                    Stock selectedStock = market.findStock(symbol);


                    if(selectedStock != null) {

                        System.out.print("Enter Quantity: ");
                        int quantity = sc.nextInt();

                        portfolio.buyStock(selectedStock, quantity);

                    }
                    else {

                        System.out.println("Stock Not Found!");

                    }

                    break;



                case 3:

                    System.out.print("\nEnter Stock Symbol to Sell: ");
                    String sellSymbol = sc.next();


                    System.out.print("Enter Quantity to Sell: ");
                    int sellQuantity = sc.nextInt();


                    portfolio.sellStock(sellSymbol, sellQuantity);

                    break;



                case 4:

                    portfolio.displayPortfolio();

                    break;



                case 5:

                    portfolio.calculateProfitLoss();

                    break;



                case 6:

                    System.out.print("\nEnter Stock Symbol: ");
                    String updateSymbol = sc.next();


                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();


                    market.updateStockPrice(updateSymbol, newPrice);

                    break;



                case 7:

                    portfolio.displayTransactions();

                    break;



                case 8:

                    System.out.println("Thank You For Using Stock System!");

                    break;



                default:

                    System.out.println("Invalid Choice!");

            }


        } while(choice != 8);


        sc.close();

    }

}