/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public Account(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountHolder(){
        return accountHolder;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    
    public void setBalance(double balance){
        this.balance= balance;
    }
    
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    
    public void calculateInterest(){};
}
