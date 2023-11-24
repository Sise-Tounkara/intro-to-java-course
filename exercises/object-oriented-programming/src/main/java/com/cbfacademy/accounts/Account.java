package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    protected double balance;
    double amount;
    double requested;
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double deposit(double deposit) {
        balance += deposit;
        return balance;
    }
    public double withdraw(double requested) {
        if (balance < requested || requested <= 0) {
            return 0.00;
        }
        else {
            balance -= requested;
        }
        return requested;
    }
    public String toString() {
        return String.format("Account no: %d Balance: £%.2f", accountNumber, balance);
    }
}
