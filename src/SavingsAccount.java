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

    // Calculate the interest amount based on current balance
    public double calculateInterestAmount() {
        return getBalance() * interestRate;
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

    // Apply monthly interest if balance is positive
    public void applyMonthlyInterest() {
        if (getBalance() > 0) {
            double interest = calculateInterestAmount();
            setBalance(getBalance() + interest);
            System.out.printf("Interest added RM%.2f%n", interest);
        } else {
            System.out.println("No interest applied. ");
        }
    }

    // Display summary at the end of the month
    public void endOfMonth() {
        System.out.println("\nSavings Account Month-End Summary:");
        applyMonthlyInterest();
        System.out.printf("Balance: RM%.2f%n", getBalance());
    }
}