package bankdetails;


	public class Bank {
	    private String holderName;
	    private double balance;

	    // Constructor to initialize account holder name and balance
	    public Bank(String holderName, double initialBalance) {
	        this.holderName = holderName;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrawn: " + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }

	    // Main method to demonstrate functionality
	    public static void main(String[] args) {
	        Bank account = new Bank("Alice Johnson", 1000.0);

	        System.out.println("Account Holder: " + account.holderName);
	        account.checkBalance();

	        account.deposit(500.0);
	        account.checkBalance();

	        account.withdraw(300.0);
	        account.checkBalance();

	        account.withdraw(1500.0); // Attempt to withdraw more than balance
	    }
	}



