package BankingTransactionSystem;

class Bank {
    // Static variable to keep track of total accounts
    private static int totalAccounts = 0;

    // Static method to get the current number of total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to increment total accounts (called whenever a new account is created)
    public static void incrementTotalAccounts() {
        totalAccounts++;
    }
}
