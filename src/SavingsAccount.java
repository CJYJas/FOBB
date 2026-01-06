/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fobb.bankingsystem;

/**
 *
 * @author Jasmine Chin
 */
// SavingsAccount class inherits from Account
public class SavingsAccount extends Account {

    // Interest rate for the savings account
    private double interestRate;

    // Minimum balance that must be maintained
    private double minimumBalance;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    // Getter method to return the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Implement the interest formula and validation
    @Override
    public void calculateInterest() {
        // Validation check
        if (getBalance() > 0) {
            double interest = getBalance() * interestRate;
            
            // Update balance safely using inherited setter
            setBalance(getBalance() + interest);
            
            System.out.printf("Interest Calculated: RM%.2f | New Balance: RM%.2f%n", interest, getBalance());
        } else {
            System.out.println("No interest applied (Balance is not positive).");
        }
    }

    // Withdraw money with minimum balance checking
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Savings withdrawal failed. Amount must be positive.");
            return false;
        }

        // Check if balance after withdrawal is still above minimum balance
        if (getBalance() - amount >= minimumBalance) {
            setBalance(getBalance() - amount);
            System.out.printf("Savings withdrawal RM%.2f%n", amount);
            return true;
        } else {
            System.out.println("Savings withdrawal failed.");
            return false;
        }
    }

    // Deposit money into the savings account
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

 
    // "Month-End" method to print summary
    @Override
    public void monthEndSummary() {
        System.out.println("\n--- Savings Account Month-End Summary ---");
        System.out.println("Account Holder: " + getAccountHolder());
        
        // Calculate and apply the interest
        calculateInterest(); 
        
        System.out.printf("Final Month-End Balance: RM%.2f%n", getBalance());
        System.out.println("-----------------------------------------");
    }
}

