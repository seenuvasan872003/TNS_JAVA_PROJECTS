package BankingTransactionSystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CheckingAccount
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        // Perform operations on SavingsAccount
        savings.deposit(200);
        savings.withdraw(50);
        savings.displayBalance();

        // Perform operations on CheckingAccount
        checking.deposit(100);
        checking.withdraw(700); // Test overdraft
        checking.displayBalance();

        // Display total number of accounts
        System.out.println("Total number of accounts: " + Bank.getTotalAccounts());
    }
}
