package BankingTransactionSystem;

abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
        Bank.incrementTotalAccounts(); // Increment total accounts whenever a new account is created
    }

    // Abstract methods for deposit, withdraw, and getBalance
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method to display account balance
    public void displayBalance() {
        System.out.println("Account balance: " + getBalance());
    }
}
