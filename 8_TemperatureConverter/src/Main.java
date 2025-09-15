public class Main {
    public static void main(String[] args){
        // Ternary operator ? -Return 1 of 2 values if a condition is true
        // variable= (condition) ? ifTrue : ifFalse;
        int score=70;
        if( score>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        String result= (score>=60) ? "Pass": "Fail";
        System.out.println(result);

        int hours=12;
        int time=(hours>12)? hours-12: hours;
        String tod=(hours<12)? "am":"pm";
        System.out.println(time+tod);

        
    }
}
