import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        //if statements
//        int age;
//        System.out.print("Enter your age: ");
//        age=scanner.nextInt();
//        if(age>=65){
//            System.out.println("You are a senior citizen");
//        }
//        else if(age>=18){
//            System.out.println("You are an adult");
//        }
//        else if(age<0){
//            System.out.println("You havent been born yet");
//        }
//        else{
//            System.out.println("You are a child");
//        }

        //*****************************************************

//        Random random= new Random();
//        int number1;
//        int number2;
//        int number3;
//
////        number=random.nextInt();// very large number
//        number1=random.nextInt(1,7);
//        System.out.println(number1);
//
//        number2=random.nextInt(1,7);
//        System.out.println(number2);
//
//        number3=random.nextInt(1,7);
//        System.out.println(number3);
////        random.nextDouble() generates random number between 0 and 1 (decimal number)
////        random.nextBoolean() can be used for situations like flipping a coin

//        //*****************************************************
//
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//        double result;
//
//        result=Math.pow(2,3); //2^3
//        result=Math.abs(-5); //5
//        result=Math.sqrt(9); //3
//        result=Math.round(3.14); // working with double => 3.0
//        result=Math.ceil(3.14);
//        result=Math.floor(3.99);
//        result=Math.max(10,20);
//        result=Math.min(10,20);
//
//        System.out.println(result);
//

//
//        //****************************************************

        // Hypotenuse c=sqrt(a^2+b^2)
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter value of side A: ");
//        a=scanner.nextDouble();
//        System.out.print("Enter value of side B: ");
//        b=scanner.nextDouble();
//        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//
//        System.out.println("The hypotenuse measures: "+c);
//

        // dimensions of a circle/sphere

        double radius;
        double circum;
        double area;
        double volume;

        System.out.print("Enter the radius : ");
        radius=scanner.nextDouble();

        circum=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius,2);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.printf("Circumference: %.1f\n",circum);
        System.out.printf("Area: %.2f\n",area);
        System.out.printf("Volume: %.3f\n",volume);

        scanner.close();

    }
}