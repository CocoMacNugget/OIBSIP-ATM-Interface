/**
 *
 * @author Safiya Elmi
 */
public class ATMSystem {

    public static void main(String[] args) {
         // Create user with userId and pin
        User user = new User("0478294", "1234");
        Account account = user.getAccount(); // Access the user's account

        // Initialize ATM system
        ATMSystems atmSystem = new ATMSystems(user);

        // Display welcome message
        System.out.println("Welcome to the ATM System, " + user.getUserId() 
                + "!");
        
        // Handle user input for ATM operations
        atmSystem.handUserInput();
    }
    
}
