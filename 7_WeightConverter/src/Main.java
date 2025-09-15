import java.util.Scanner;

public class Main {
    public static void main( String[] args){
        //Weight Converter
        Scanner scanner=new Scanner(System.in);

        //Declare variables
        double weight;
        double newWeight;
        int choice;

        //welcome message
        System.out.println("Weight conversion Program");

        //prompt for user choice
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.print("Enter weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("The new weight in kgs is %.2f",newWeight);
        }
        else if(choice==2){
            System.out.println("Enter weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight= weight * 2.20462;
            System.out.printf("The new weight in lbs is %.2f",newWeight);
        }
        else{
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
