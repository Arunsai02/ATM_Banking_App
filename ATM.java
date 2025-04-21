package com.atm.banking;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Banking bank = new Banking();
        Scanner sc = new Scanner(System.in);
        String cpin = "";

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("Please create your 4-digit PIN: ");
            cpin = sc.nextLine();
            if (cpin.length() == 4 && cpin.matches("[0-9]{4}")) {
                break;
            } else {
                System.out.println("Invalid PIN. Please enter a valid 4-digit PIN: ");
            }
        }

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Banking");
            System.out.println("2. Change PIN");
            System.out.println("3. Help");
            System.out.println("4. Exit");
            System.out.println("------------------");
            System.out.println("Select an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Back to main menu");
                        System.out.println("------------------");
                        System.out.println("Select an option: ");
                        int option = sc.nextInt();
                        sc.nextLine();

                        switch (option) {
                            case 1:
                                System.out.println("Please enter your PIN: ");
                                String pin = sc.nextLine();
                                while (!pin.equals(cpin)) {
                                    System.out.println("Incorrect PIN: ");
                                    pin = sc.nextLine();
                                }
                                bank.checkBalance();
                                break;
                            case 2:
                                System.out.println("Please enter your PIN: ");
                                pin = sc.nextLine();
                                while (!pin.equals(cpin)) {
                                    System.out.println("Incorrect PIN: ");
                                    pin = sc.nextLine();
                                }
                                System.out.println("Enter the amount to deposit: ");
                                int amount = sc.nextInt();
                                sc.nextLine();
                                if (amount <= 0) {
                                    System.out.println("Please enter a positive amount.");
                                    break;
                                }
                                bank.deposit(amount);
                                break;
                            case 3:
                                System.out.println("Please enter your PIN: ");
                                pin = sc.nextLine();
                                while (!pin.equals(cpin)) {
                                    System.out.println("Incorrect PIN: ");
                                    pin = sc.nextLine();
                                }
                                System.out.println("Enter the amount to withdraw: ");
                                amount = sc.nextInt();
                                sc.nextLine();
                                if (amount <= 0) {
                                    System.out.println("Please enter a positive amount.");
                                    break;
                                }
                                bank.withdraw(amount);
                                break;
                            case 4:
                                System.out.println("Returning to main menu...");
                                System.out.println("------------------");
                                break;
                            default:
                                System.out.println("Please choose a valid option.");
                        }
                        if (option == 4) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please enter your old PIN: ");
                    String oldPin = sc.nextLine();
                    if (oldPin.equals(cpin)) {
                        System.out.println("Please enter your new PIN: ");
                        String newPin = sc.nextLine();
                        if (newPin.length() == 4 && newPin.matches("[0-9]{4}")) {
                            cpin = newPin;
                            System.out.println("PIN has been updated.\nYour new PIN is: " + cpin);
                        } else {
                            System.out.println("Invalid PIN. Please enter a valid 4-digit PIN.");
                        }
                    } else {
                        System.out.println("Incorrect old PIN. PIN not changed.");
                    }
                    break;
                case 3:
                    System.out.println("For assistance, call our toll-free number: 1880 5674 2345");
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM service. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }
        }
    }
}
