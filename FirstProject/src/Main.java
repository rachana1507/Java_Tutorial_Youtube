import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //My first java program
        /*
        Learning
        Comments
        Multi-line
         */
        System.out.println("Hello World\n");
        System.out.println("I am Rachana");
        System.out.print("");

//        Variable is a reusable container for values.

//        Primitive variables: A simple value stored directly in memory (stack).
//        Eg:- int, double, char, boolean

//        Reference variables: Memory address(in a stack) that points to the (location in heap)
//        Eg:- string, array, object

//        Steps to create variable: 1) Declaration 2) Assignment

        //Primitive data types:
        int age; //declaration
        age=21; //assignment or initialization
        int year=2025;
        int quantity=1;
        System.out.print(age);
        System.out.print(" ");
        System.out.println(year+" "+quantity);
        System.out.println("The year is "+year);

        double price=12;
        double gpa =8.27;
        double temperature= -12.5;

        System.out.println("Rs "+price);

        char grade='A';
        char symbol='!';
        char currency='$';
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);
        System.out.println(""+grade+symbol+currency); //use "" otherwise will give output 134

//        boolean isStudent = true; //camel case naming convention
        boolean forSale=false;
        boolean isOnline=true;

//        System.out.println(isStudent+forSale++isOnline); will give error : bad operand types for binary operator +
//        System.out.println(isStudent+" "+forSale+" "+isOnline); //seen in if statements

        //Reference data types:
        // string - series of characters
        String name = "Rachana R Aithal";
        System.out.println("Hello "+name);
        System.out.println("You are "+ age+" years old");
        System.out.println("Your gpa is "+ gpa);
        System.out.println("Your grade is "+grade);
        System.out.println("The car costs "+currency+price);

        Scanner scanner = new Scanner(System.in); //scanner object can read user input from standard input
        System.out.print("Enter your name:");
        name=scanner.nextLine();
        System.out.println("Hello"+name);
        System.out.println("Enter college");
        String college=scanner.next(); // Reads single word

        System.out.println("Are you a student? (true/false)");
        boolean isStudent=scanner.nextBoolean();
        //nextInt(), nextDouble(), nextBoolean()
        scanner.close(); //good practice to close at end else unexpected behavior.
        System.out.println("your college is "+college);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }
    }
}