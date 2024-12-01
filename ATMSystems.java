import java.util.Scanner;

/**
 *
 * @author Safiya Elmi
 */
public class ATMSystems {
    private User user;
    private ATMOperations atmops;
    
    // Default constuctor
    public ATMSystems(){
    }
    
    // Parameterised constructor
    public ATMSystems(User user){
        this.user = user;
        this.atmops = new ATMOperations();
        this.atmops.setAccount(user.getAccount());
    }
    
    // Getters and Setters for user and atmops
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    public ATMOperations getAtmops(){
        return atmops;
    }
    
    public void setAtmops(ATMOperations atmops){
        this.atmops = atmops;
    }
    
    // Display menu
    public void displayMenu(){
        System.out.println("\n---------- ATM Menu ----------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. View Transaction History");
        System.out.println("5. Exit");
    }
    
    // Handle User Input
    public void handUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1: {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atmops.deposit(depositAmount);
                    break;
                }
                
                case 2: {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    atmops.withdraw(withdrawalAmount);
                    break;
                }
                
                case 3: {
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter target account ID: ");
                    // Placeholder for account lookup
                    String targetAccountId = scanner.nextLine(); 
                    // Replace with actual account retrieval logic
                    Account targetAccount = new Account(); 
                    atmops.transfer(transferAmount, targetAccount);
                    break;
                }
                
                case 4: {
                    atmops.viewTransactionHistory();
                    break;
                }
                
                case 5: {
                    System.out.println("Exiting system. Thank you!");
                    running = false;
                    break;
                }
                
                default: 
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
