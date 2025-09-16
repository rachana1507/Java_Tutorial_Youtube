import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Nested ifs
//        boolean isStudent=true;
//        boolean isSenior=true;
//        double price=9.99;
//        if(isStudent){
//            if(isSenior){
//                System.out.println("You get a senior discount of 20%");
//                System.out.println("You get a student discount of 10%");
//                price*=0.7;
//            }
//            else{
//                System.out.println("You get a student discount of 10%");
//                price*=0.9;
//            }
//        }
//        else{
//            //price remains same
//            if(isSenior){
//                System.out.println("You get a senior discount of 20%");
//                price*=0.8;
//            }
//            else{
//                price*=1;
//            }
//        }
//        System.out.printf("The price of a ticket is: $%.2f",price);

        //Strings
//        String name="Rachana Aithal";
//        int length=name.length();
//        char letter=name.charAt(8);
//        int index=name.indexOf("a",2);
//        int lastindex=name.lastIndexOf("a");
//
//        System.out.println(name+length+" "+letter+index);
//        System.out.println(name);
//        System.out.println(lastindex);
//
//        name=name.toUpperCase();
//        System.out.println(name);
//        name=name.toLowerCase();
//        System.out.println(name);
//
//        String trimmingstr="     hei na    ";
//        System.out.println(trimmingstr);
//        trimmingstr=trimmingstr.trim();
//        System.out.println(trimmingstr);
//
//        trimmingstr=trimmingstr.replace("i","y");
//        System.out.println(trimmingstr);
//
//        String check=" ";
//        System.out.println(check.isEmpty());

        //substrings - a method used to extract a portion of string
        // str.substring(start,end);

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email=scanner.next();

        if( email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username + " " + domain);
        }
        else{
            System.out.println("Invalid email - must contain @");
        }

        scanner.close();
    }
}
