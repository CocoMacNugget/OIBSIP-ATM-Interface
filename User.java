/**
 *
 * @author Safiya Elmi
 */
public class User {
    private String userId;
    private String pin;
    private Account account;
    
    // Defualt constructor
    public User(){
    }
    
    // Parameterised constructor
    public User (String userId, String pin){
        this.userId = userId;
        this.pin = pin;
        this.account = new Account();
    }
    
    // Getters and setters for userId, pin and account
    public String getUserId(){
        return userId;
    }
    
    public void setUserId(String userId){
        this.userId = userId;
    }
    
    public String getPin(){
        return pin;
    }
    
    public void setPin(String pin){
        this.pin = pin;
    }
    
    public Account getAccount(){
        return account;
    }
    
    public void setAccount(Account account){
        this.account = account;
    }
    
    // Validation method
    public boolean validationLogin(String enteredUserId, String enteredPin){
        return this.userId.equals(enteredUserId) && this.pin.equals(enteredPin);
    }
    
}
