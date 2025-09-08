import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Arithmetic Operators
//        int x=10;
//        int y=2;
//        int z;

//        z=x+y;
//        z=x-y;
//        z=x*y;
//        z=x/y;
//        z=x%y;
//        int a=6;
//        int b=4;
//        z=b%a;
//        z=a%b;
//        System.out.println(z);

//        // Augmented Assignment Operators
//        int x=10;
//        int y=3;
////        x=x+y; // There is a shortcut for this
//        x += y;
//        x -=y;
//        x*=y;
//        x/=y;
//        System.out.println(x);

        // SIMPLE SHOPPING CART PROGRAM
        Scanner scanner=new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency='$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item=scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price=scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity=scanner.nextInt();

        total=price*quantity;
        System.out.println("You have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+currency+total);

        scanner.close();
    }
}