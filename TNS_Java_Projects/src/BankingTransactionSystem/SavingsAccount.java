package BankingTransactionSystem;

class SavingsAccount extends Account {
    private double interestRate = 0.03; // 3% interest rate, for example

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Savings Account.");
        }
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance + (balance * interestRate); // Balance with interest
    }
}

