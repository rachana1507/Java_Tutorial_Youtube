public class Main {
    public static void main(String[] main){

        //searching an array
        int[] numbers={1,6,8,2,4,9,3};
        int target=7;
        boolean isFound=false;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                isFound=true;
                System.out.printf("%d in index %d",target, i);
                break;
            }
        }
        if (!isFound){
            System.out.println("Target not found");
        }

        //varargs =variable arguments allow a method
        // to accept varying number of arguments
        // makes methods more flexible
        // no need for overloaded methods
        // java will pack the arguments into an array
        // ... - ellipses

        System.out.println(add(1,2,3,4));

        // 2 d arrays
        // each element is an array

//       String[][] groceries={};
        char[][] telephone={
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};

        for(char[] line: telephone){
            for(char number: line){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
    static int add(int ... numbers){
//        System.out.println(numbers);
        int sum=0;
        for(int i: numbers){
            sum+=i;
        }
        return sum;
    }
}
