/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09p07;
import java.util.*;
/**
 *
 * @author mitch
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Account account = new Account( 1122, 20000.0);
    //why didnt it just work up here ^^^
    account.setAnnualInterestRate(3.5);
    account.setBalance(20000);
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("The balance is " + account.getBalance() + ", the monthly interest is " + account.getMonthlyInterest()+ ", and the date of account creation is " + account.getDateCreated());
        

// TODO code application logic here
    }
    
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated = new java.util.Date();
 
    
    Account() {
}
    Account (double newId, double newBalance) {
        
    }
    int getId() {
        return id;
    }
    double getBalance() {
        return balance;
    }
    double getAnnualInterestRate() {
        return annualInterestRate;
    }
    void setId(int newId) {
        id = newId;
    }
    void setBalance(double newBalance) {
        balance= newBalance;
    }
    void setAnnualInterestRate(double newAnnualIntersetRate) {
        annualInterestRate = newAnnualIntersetRate;
    }
    Date getDateCreated() {
        java.util.Date date = new java.util.Date();
        //dateCreated = date.getTime();
        return dateCreated;
    }
    double getMonthlyInterestRate() {
    return annualInterestRate / 12;
    }
    
    double getMonthlyInterest() {
        return balance*getMonthlyInterestRate()/(100);
    }
    
    void withdraw (double withdrawal) {
        balance = balance - withdrawal;
    }
    
    void deposit (double deposit) {
         balance = balance + deposit;
    }
    
}
    

