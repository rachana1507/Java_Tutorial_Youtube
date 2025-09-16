import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Ternary operator ? -Return 1 of 2 values if a condition is true
        // variable= (condition) ? ifTrue : ifFalse;
//        int score=70;
//        if( score>=60){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("Fail");
//        }
//
//        String result= (score>=60) ? "Pass": "Fail";
//        System.out.println(result);
//
//        int hours=12;
//        int time=(hours>12)? hours-12: hours;
//        String tod=(hours<12)? "am":"pm";
//        System.out.println(time+tod);

        //Temperature converter

        Scanner scanner=new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit=scanner.next().toUpperCase(); //method chaining

        newtemp=(unit.equals("C"))? (temp-32)*5/9 : (9*temp)/5 +32;

        System.out.printf("The new temperature is %.2f degrees",newtemp);


        scanner.close();
    }
}
