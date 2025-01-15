package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(String accountId, String accountHolderName, double initialDeposit) {
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit cannot be negative.");
        }
        Account account = new Account(accountId, accountHolderName, initialDeposit);
        accounts.add(account);
        return account;
    }

    public Account findAccountById(String accountId) {
        return accounts.stream()
                .filter(account -> account.getAccountId().equals(accountId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Account not found."));
    }

    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts);
    }
}
