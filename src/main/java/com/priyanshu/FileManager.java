package com.priyanshu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileManager {


    private String fileName = "transactions.txt";



    // Save Transaction
    public void saveTransaction(Transaction transaction) {


        try {


            FileWriter writer = new FileWriter(fileName, true);



            writer.write(
                    transaction.getType()
                            + " - "
                            + transaction.getStockSymbol()
                            + " - Quantity: "
                            + transaction.getQuantity()
                            + "\n"
            );



            writer.close();



        }
        catch(IOException e) {


            System.out.println(
                    "Error saving transaction!"
            );


        }


    }





    // Read Transactions
    public void readTransactions() {


        try {


            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(fileName)
                    );



            String line;



            System.out.println("\n===== SAVED TRANSACTIONS =====");



            while((line = reader.readLine()) != null) {


                System.out.println(line);


            }



            reader.close();



        }
        catch(IOException e) {


            System.out.println(
                    "No Transaction File Found!"
            );


        }


    }


}