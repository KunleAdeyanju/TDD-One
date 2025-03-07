package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass
    String accountNumber;
    String ownerName;
    double balance = 0.0;
    
    public BankAccount(String accountNumber, String ownerName) {
        // Your implementation here
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

    }
    
    public String getAccountNumber() {
        // Your implementation here
        // BankAccount b = new BankAccount(accountNumber,ownerName);
        // return b.accountNumber;

        return accountNumber;
    }

    public String getOwnerName() {
        // Your implementation here
        // BankAccount b = new BankAccount(accountNumber,ownerName);
        // return b.ownerName;
        return ownerName;
    }
    
    public double getBalance() {
        // Your implementation here
        return balance;
    }
    
    public void deposit(double amount) {
        // Your implementation here
        if(amount < 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }else {
            balance = balance + amount;
        }
        //System.out.println(balance);

        //return amount;
    }
    
    public void withdraw(double amount) {
        // Your implementation here
        System.out.println(balance);
        if(amount > balance){
            throw new IllegalStateException("Insufficient funds");
        } else if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        } else{
            balance -= amount;
        }

    }
}
