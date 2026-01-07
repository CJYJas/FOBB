/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author nggeo
 */
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        // Instantiate accounts
        SavingsAccount savings = new SavingsAccount("S10182909", "Alice", 1000.0, 0.05, 100.0);
        CurrentAccount current = new CurrentAccount("C20229023", "Bob", 500.0, 200.0, 2.50);
        
        //list to store bothh objects
        List<Account> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);
        
        //deposits money to both savings account and current account
        System.out.println("Deposits");
        for (Account acc : accounts) 
            acc.deposit(200);

        System.out.println("Withdrawal");
        // Test Savings: Attempt to overdraw below minimum balance
        savings.withdraw(1200); 
        
        // Test Current: Overdraw within limit
        current.withdraw(600); 

        System.out.println("Month-End");
        for (Account acc : accounts) {
            acc.calculateInterest();
            acc.monthEndSummary();
            System.out.println();
        }
    }
}