import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        // FOR LOOP - Executes some code a CERTAIN amount of times

//        for(int i=0 ;i<10 ;i++ ){
//            System.out.println(i);
//        }

        // COUNTDOWN

        Scanner scanner=new Scanner(System.in);

//        System.out.print("How many seconds to countdown from?: ");
//        int start=scanner.nextInt();
//
//        for(int i=start;i>0;i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR!!!");

        // break= break out of a loop (STOP)
        //continue= skip current iteration of a loop (SKIP)

//        for(int i=0; i<10; i++){
//            if(i==5){
////                break;
//                continue;
//            }
//            System.out.print(i+" ");
//
//        }

        // MATRIX OF A SYMBOL

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter number of rows: ");
        rows=scanner.nextInt();

        System.out.print("Enter number of columns: ");
        columns=scanner.nextInt();

        System.out.print("Enter symbol: ");
        symbol=scanner.next().charAt(0);

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
