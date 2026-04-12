class BankAccount {
    // Private attributes (Encapsulation)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Getter method to check balance (Controlled access)
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Encaps {
    public static void main(String[] args) {
        // Creating a new account
        BankAccount myAccount = new BankAccount("SAV123", 1000.0);

        // Performing operations
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        
        // Checking balance
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Current Balance: $" + myAccount.getBalance());
        
        // Note: myAccount.balance = 1000000; would throw a compile error 
        // because balance is private. This is the power of encapsulation!
    }
}