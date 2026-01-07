package fobb;

class CurrentAccount extends Account{
    private double overdraftLimit;
    private double transactionFee;
    
    public CurrentAccount(String accountNumber, String accountHolder,double balance,double overdraftLimit,double transactionFee){
        super(accountNumber,accountHolder,balance);
        this.overdraftLimit=overdraftLimit;
        this.transactionFee=transactionFee;
    }
    
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    
    @Override
    public void calculateInterest(){
        System.out.println("No Interest Rate for Current Account");
    }
    
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= (amount + transactionFee)) {
            double newBalance = getBalance() - amount - transactionFee;
            setBalance(newBalance); 
        } else {
            System.out.println("Transaction rejected: Overdraft limit exceeded.");
        }
    }
    
    public void monthEndSummary() {
        System.out.println("--- Current Account Month-End Summary ---");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Final Balance (Fees Applied): " + getBalance());
    }
}