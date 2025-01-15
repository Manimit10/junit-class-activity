package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void testValidAccountCreation(){
        Bank bank = new Bank();
        Account account = bank.createAccount("1", "John Doe", 1000);
        assertNotNull(account);
        assertEquals(1000, account.getBalance());
    }

}