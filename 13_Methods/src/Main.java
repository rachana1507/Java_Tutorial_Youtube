public class Main {
    public static void main(String[] args){
        // method- a block of reusable code that is executed when called ()
//
//        String name="R";
//        happyBirthday(name); //if no static no object yet . Do not know which objects happyBirthday() to run.
//        double sqr=square(3);
//        System.out.println(sqr);
//
//    }
//    static void happyBirthday(String name){
//        System.out.printf("Happy Birthday to %s!\n", name);
//    }
//    static double square(double number){
//        return number*number;

        //Overloaded methods = methods that share the same name, but different parameters
        // signature = name + parameters

        System.out.println(add(1,2,3));

    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a,double b, double c){
        return a+b+c;
    }
}
