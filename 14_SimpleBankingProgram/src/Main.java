import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // BANKING PROGRAM

        // declare variables
        double balance=0;
        boolean isRunning=true;
        int choice;

        while(isRunning) {
            // display menu
            System.out.println("***********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***********************");

            // get and process users choice
            System.out.print("Enter you choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    // show balance
                    showBalance(balance);
                }
                case 2 -> {
                    // deposit
                    balance=deposit(balance);
                }
                case 3 -> {
                    // withdraw
                    balance=withdraw(balance);
                }
                case 4 -> {
                    //exit
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("Thank you! Have a nice day");
        System.out.println("*********************");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your balance is %.2f\n", balance);
    }
    static double deposit(double balance){
        System.out.print("Enter amount to deposit: ");
        double amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            balance += amount;
            System.out.printf("Deposited %.2f amount successfully\n", amount);
            return balance;
        }
    }
    static double withdraw(double balance){
        System.out.print("Enter amount to withdraw: ");
        double amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else if(amount>balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else {
            balance -= amount;
            System.out.printf("%.2f amount Withdrawn successfully\n", amount);
            return balance;
        }
    }
}
