import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Quiz game

//        // array of questions
//        String[] questions={"What is the main function of a router?",
//                "Which part of the computer is considered the brain?",
//                "What year was facebook launched?",
//                "Who is known as the father of computer?",
//                "What was the first programming language?"};
//
//        // options - 2d array
//        String[][] options={{"1. Storing files", "2. Encrypting data","3. Directing internet traffic", "4. Managing passwords"},
//                {"1. CPU","2. Hard drive","3. RAM","4. GPU"},
//                {"1. 2000","2. 2004","3. 2006","4. 2008"},
//                {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
//                {"1. COBOL","2. C","3. Fortran","4. Assembly"}};
//
//        // declare variables
//        int[] answers={3, 1, 2, 4, 3};
//        int score=0;
//        int guess;
        Scanner scanner=new Scanner(System.in);
//
//        // welcome message
//        System.out.println("******************************");
//        System.out.println("Welcome to the Quiz game!");
//        System.out.println("******************************");
//
//        // list question - loop
//        for(int i=0; i<questions.length;i++){
//            System.out.println(questions[i]);
//            //   options
//            for(String option: options[i]){
//                System.out.println(option);
//            }
//            //   get guess from user
//            System.out.print("Your Choice is: ");
//            guess=scanner.nextInt();
//            //   check our guess
//            if(guess==answers[i]){
//                score+=1;
//            }
//            System.out.println("Correct Answer: "+answers[i]);
//            System.out.println("******************************");
//        }
//        // display final score
//        System.out.println("******************************");
//        System.out.println("Your score is: "+score);
//        System.out.println("******************************");

        // Rock paper Scissors

        // declare variables
        String[] choices={"rock", "paper", "scissors"};
        Random random=new Random();
        String userchoice;
        String compchoice;
        int score=0;
        boolean stop=false;
        int i=0;

        // get choice from the user
        do{
            compchoice=choices[random.nextInt(0,3)];
            for(String choice:choices){
                System.out.print(choice+" ");
            }
            System.out.print("Enter your move: ");
            userchoice=scanner.next();
            System.out.println("Computer picks "+compchoice);
            if(userchoice.equals(compchoice)){

                System.out.println("It's a tie");
            }
            else if((userchoice.equals("rock")&&(compchoice.equals("scissors")))|| ((userchoice.equals("scissors")&&compchoice.equals("paper")))||((userchoice.equals("paper")&&compchoice.equals("rock")))){
                System.out.println("You win");
                score+=1;
            }else{
                System.out.println("You lose");
            }

            // ask to play again
            System.out.print("Do you want to continue playing? (Y/N): ");
            String play=scanner.next().toUpperCase();
            i++;
            if(play.equals("N")){
                stop=true;
            }
            else if(!play.equals("Y")){
                System.out.println("Invalid entry. Default No");
            }


        }while(!stop);

        System.out.println("Thanks for playing. Your score is "+score);

        scanner.close();
    }
}
