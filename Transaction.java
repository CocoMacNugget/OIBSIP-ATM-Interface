import java.util.Date;

/**
 *
 * @author Safiya Elmi
 */
public class Transaction {
    private String type;
    private double amount;
    private Date timestamp;
    
    // Parameterised constructor
    public Transaction (String type, double amount){
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }
    
    // Getters and Setters for type, amount and timestamp
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public Date getTimestamp(){
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }
}
