import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // LOGICAL OPERATORS

        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;
        System.out.print("Enter your username: ");
        username=scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains("_") || username.contains(" ")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome "+username);
        }


        scanner.close();
    }
}
