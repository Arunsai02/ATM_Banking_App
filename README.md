# **ATM Banking System**

## **Overview**

This project simulates an ATM banking system where users can create a PIN, check their balance, deposit money, withdraw money, and change their PIN. The system consists of two main classes:

- **ATM**: The main program that handles user interaction, including PIN validation and menu options.
- **Banking**: A helper class that manages the account balance and supports deposit, withdrawal, and balance-checking operations.

## **Classes**

### **1. ATM Class**

The `ATM` class is responsible for the user interface and interaction with the user. It includes the following functionalities:

- **PIN Creation**: The user must create a valid 4-digit PIN to access the ATM system.
- **Main Menu**: Offers the user the following options:
  1. **Banking** (Check Balance, Deposit, Withdraw)
  2. **Change PIN**
  3. **Help**
  4. **Exit**
- **Banking Operations**:
  - **Check Balance**: Allows the user to check the balance in their account after entering the correct PIN.
  - **Deposit**: Allows the user to deposit a specified amount into their account after PIN validation.
  - **Withdraw**: Allows the user to withdraw a specified amount from their account if there are sufficient funds.
- **Change PIN**: Allows the user to change their PIN after providing the old PIN and entering a valid new one.
- **Help**: Provides a toll-free number for customer support.
- **Exit**: Ends the session and closes the ATM system.

### **2. Banking Class**

The `Banking` class handles the account's core banking functionality. It includes:

- **Check Balance**: Displays the current balance.
- **Deposit**: Adds a specified amount to the current balance.
- **Withdraw**: Subtracts a specified amount from the balance, provided there are sufficient funds.

### **Functionality and Workflow**

1. **ATM Class** starts by prompting the user to create a 4-digit PIN.
2. Once the user has set a valid PIN, the program enters the main menu and gives the user options to perform banking operations, change their PIN, get help, or exit.
3. In the banking section, users must enter their PIN to validate actions such as checking the balance, depositing, or withdrawing funds.
4. The program will continuously ask for input until the user selects the "Exit" option.
5. The user can also change their PIN by providing the correct old PIN and a valid new 4-digit PIN.

### **License**

This project is open-source and free to use for educational and personal purposes.
