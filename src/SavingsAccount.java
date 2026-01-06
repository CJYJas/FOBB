/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fobb.bankingsystem;

/**
 *
 * @author Jasmine Chin
 */
public class SavingsAccount extends Account{
    
    private double interestRate;
    private double minimumBalance;
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    @Override
    public double calculateInterest(){
        return getBalance()*interestRate;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && getBalance()-amount >= minimumBalance) {
            updateBalance(-amount);
            System.out.printf("Savings withdrawal RM%.2f%n", amount);
            return true;
        } else {
            System.out.println("Savings withdrawal failed (minimum balance failed)");
            return false;
        }
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            updateBalance(amount);
            System.out.println("Deposited RM" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void applyMonthlyInterest(){
        if (getBalance() > 0){
            double interest = calculateInterest();
            updateBalance(interest);
            System.out.println("Interest added RM" + String.format("%.2f", interest));
        }
    }
    
    public void endOfMonth(){
        System.out.println("\nSavings Account Month-End Summary: ");
        displayInfo();
        applyMonthlyInterest();
    }
}
