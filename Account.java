import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Safiya Elmi
 */
public class Account {
    private double balance;
    private List<Transaction> transactions;
    
    // Constructor
    public Account(){
        this.balance = 0.0; 
        this.transactions = new ArrayList<>();
    }
    
    // Getters and Setters
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public List<Transaction> getTransactions(){
        return transactions;
    }
    
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
    
    // Updating the balance method
    public void updateBalance(double amount){
        this.balance += amount; // Increase or decrease balance
    }
}
