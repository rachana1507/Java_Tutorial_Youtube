import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Enhanced switches : replacement for too many else if statements
        // java14 feature

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter day: ");
        String day=scanner.next();
        switch(day){ // arrow operator in java means do something/do this
            case "Monday" , "Tuesday" ,"Wednesday" ,"Thursday" , "Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday" ,  "Sunday" ->
                    System.out.println("It is a weekend");
            default -> System.out.println(day+" is not a day");
        }

        scanner.close();
    }
}
