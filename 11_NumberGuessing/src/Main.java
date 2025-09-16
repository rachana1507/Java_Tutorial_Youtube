import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int guess=-1;
        int attempts=0;
        int min=1;
        int max=100;
        int randomnumber=random.nextInt(min,max+1);

        do{
            attempts++;
            System.out.printf("Attempt %d: Guess number between %d and %d: ",attempts,min,max);
            guess=scanner.nextInt();
            if(guess<randomnumber){
                System.out.println("Too low! Try again");
            }
            else if(guess>randomnumber){
                System.out.println("Too high! Try again");
            }
        }while(guess!=randomnumber);

        System.out.printf("You guessed the number in %d attemps!",attempts);

        scanner.close();

    }
}
