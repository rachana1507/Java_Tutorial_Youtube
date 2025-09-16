import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Enhanced switches : replacement for too many else if statements
        // java14 feature

//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter day: ");
//        String day=scanner.next();
//        switch(day){ // arrow operator in java means do something/do this
//            case "Monday" , "Tuesday" ,"Wednesday" ,"Thursday" , "Friday" ->
//                    System.out.println("It is a weekday");
//            case "Saturday" ,  "Sunday" ->
//                    System.out.println("It is a weekend");
//            default -> System.out.println(day+" is not a day");
//        }
//        scanner.close();

        Scanner scanner=new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0; //java requires all variables to be definitely assigned before use
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();
        System.out.print("Enter an operator (+ - * / ^): ");
        operator=scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();

        switch(operator){
            case '+' -> result=num1+num2;
            case '-' -> result=num1-num2;
            case '*' -> result=num1*num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Cannot divide by zero");
                    validOperation=false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result=Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.printf("The result is %.2f",result);
        }



        scanner.close();

    }
}
