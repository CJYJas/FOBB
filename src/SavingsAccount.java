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
    
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < minimumBalance) {
            System.out.println("Transaction Rejected: Below minimum balance of " + minimumBalance);
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
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

