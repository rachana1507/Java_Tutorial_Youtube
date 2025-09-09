public class Main {
    public static void main(String[] args){
        boolean isStudent=true;
        boolean isSenior=true;

        double price=9.99;

        if(isStudent){
            System.out.println("You get a student discount of 10%");
            price*=0.9;
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price*=0.8;
            }
        }
        else{
            //price remains same
        }

        System.out.printf("The price of a ticket is: $%.2f",price);
    }
}
