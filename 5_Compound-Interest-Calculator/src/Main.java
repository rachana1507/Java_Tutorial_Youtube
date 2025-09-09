import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle=scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate=scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded=scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years=scanner.nextInt();

        amount=principle*Math.pow(1+rate/timesCompounded,timesCompounded*years);
        System.out.printf("Amount after %d years is $%.2f ", years, amount);

        scanner.close();
    }
}
