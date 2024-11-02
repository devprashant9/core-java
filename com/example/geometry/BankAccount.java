package com.example.geometry;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(long accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void depositMoney(long money) {
        if (money < 1)
            System.out.println("Enter a Valid Amount");
        else {
            System.out.println("Money Deposited Successfully");
            this.accountBalance += money;
        }
    }

    public void withDrawMoney(long money) {
        if (money > this.accountBalance)
            System.out.println("Invalid Amount");
        else if (money < 0)
            System.out.println("Invalid Amount");
        else {
            System.out.println("Money Withdrawn Successfully.");
            this.accountBalance -= money;
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
                + ", accountBalance=" + accountBalance + "]";
    }

    
}
