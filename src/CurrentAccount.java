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
    
    @Override
    public void withdraw(double amount) {
        double totalDeduction = amount + transactionFee;
        if (getBalance() - totalDeduction < - overdraftLimit) {
            System.out.println("Transaction Rejected: Overdraft limit exceeded.");
        } else {
            setBalance(getBalance() - totalDeduction);
            System.out.println("Withdrawn: " + amount + " (Fee: " + transactionFee + ")");
        }
    }
    
    public void monthEndSummary() {
        System.out.println("--- Current Account Month-End Summary ---");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Final Balance (Fees Applied): " + getBalance());
    }
}
