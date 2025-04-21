package com.atm.banking;

public class Banking {
    private int balance = 0;

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " is deposited in your account." + "\nCurrent Balance: " + balance);
        System.out.println("------------------");
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " is withdrawn from your account." + "\nCurrent Balance: " + balance);
            System.out.println("------------------");
        } else {
            System.out.println("Insufficient funds. Can not Withdraw.");
        }
    }
}
