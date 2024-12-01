import java.util.List;

/**
 *
 * @author Safiya Elmi
 */
public class ATMOperations {
    private Account account;
    
    // Constructor
    public ATMOperations (){
        this.account = new Account();
    }
    
    // Getter and Setter
    public Account getAccount(){
        return account;
    }
    
    public void setAccount(Account account){
        this.account = account;
    }
    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            account.updateBalance(amount); 
            account.addTransaction(new Transaction("Deposit", amount));
            System.out.println("Deposit successful. Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    } 

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            account.updateBalance(-amount); // Deduct amount from account balance
            account.addTransaction(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawal successful. Amount: " + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }

    // Transfer method
    public boolean transfer(double amount, Account toAccount) {
        if (amount > 0 && account.getBalance() >= amount) {
            account.updateBalance(-amount); // Deduct from source account
            toAccount.updateBalance(amount); // Add to target account
            account.addTransaction(new Transaction("Transfer to Account ID" 
                    , amount));
            toAccount.addTransaction(new Transaction("Transfer from Account ID"
                    , amount));
            System.out.println("Transfer successful. Amount: " + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }

    // View Transaction History
    public void viewTransactionHistory() {
        List<Transaction> transactions = account.getTransactions();
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction.getType() + " - Amount: " 
                    + transaction.getAmount() + " - Timestamp: " 
                    + transaction.getTimestamp());
            }
        }
    }
}
