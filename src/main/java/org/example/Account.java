package org.example;

public class Account {
    private String accountId;
    private String accountHolderName;
    private double balance;

    public Account(String accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
        balance -= amount;
    }

    public void transfer(Account targetAccount, double amount) {
        if (targetAccount == null || amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid transfer.");
        }
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }
}
