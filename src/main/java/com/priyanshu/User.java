package com.priyanshu;

public class User {

    private String userName;
    private Portfolio portfolio;


    // Constructor
    public User(String userName) {

        this.userName = userName;
        this.portfolio = new Portfolio();

    }



    // Get User Name
    public String getUserName() {

        return userName;

    }



    // Get Portfolio
    public Portfolio getPortfolio() {

        return portfolio;

    }



    // Display User Details
    public void displayUser() {

        System.out.println("===== USER DETAILS =====");
        System.out.println("User Name: " + userName);

    }

}