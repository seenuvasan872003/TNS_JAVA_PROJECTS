package BankingTransactionSystem;

class CheckingAccount extends Account {
    private double overdraftLimit = 100.0; // Overdraft limit, for example

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Checking Account.");
        }
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }
}

