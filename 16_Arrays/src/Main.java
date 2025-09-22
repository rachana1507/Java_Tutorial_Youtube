import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //arrays - collection of values of the same data type

        String[] fruits={"apple", "banana", "papaya","mango"};
        System.out.println(fruits[0]);

        fruits[1]="jackfruit";
        System.out.println(fruits[1]);

        System.out.println(fruits.length);

        String b="banana";
        System.out.println(b);

        System.out.println("***********");
        for (int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
        System.out.println();
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        System.out.println("**************");
        Arrays.sort(fruits); //alphabetic sorting
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        Arrays.fill(fruits,"pineapples");

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        Scanner scanner=new Scanner(System.in);
        String[] foods =new String[3];
        System.out.println(foods.length);

        for(int i=0;i < foods.length;i++){
            System.out.printf("Enter %dth element: ",i);
            foods[i]=scanner.nextLine();
        }
        for(String food: foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
