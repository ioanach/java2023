package com.pratica.java2023;

/**
 * Not a bean, not annontated so it will not get created automatically
 */
public class Account {
    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;
        System.out.println("Creating Account");
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return "Account{accountId='" + accountId + "'}";
    }
}
