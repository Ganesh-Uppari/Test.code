package custom_exceptions;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid withdrawal
class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with custom exception handling
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Invalid withdrawal amount. Amount cannot be negative.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw amount greater than balance.");
        }

        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
    }
}

// Main class to demonstrate BankAccount functionality
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount instance with initial balance of $1000
        BankAccount account = new BankAccount(1000);

        try {
            // Attempt to withdraw $500
            account.withdraw(500);

            // Attempt to withdraw $1500 (exceeding balance)
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
