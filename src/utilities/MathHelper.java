package utilities;

public class MathHelper {
    /*
    create max of 3 numbers. Math.max(Math.max(num1,num2),num3);
     maxOfThree int was added (argument or parameters in the paranthesis)
     command R to replace.
        if (num1 == num2 && num1 == num3) return num1; if the same
        if not equal to each dont have to think about previous statement.
        void methods do not use return method; just prints
     */
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static int middleOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);
        return num1 + num2 + num3 - max - min;

    }

    /*create a method that takes an int argument and returns true. even true, odd false
    return type
    returns boolean because true / false
    make it static
    public
    takes an int as arg
    method name = isEven // isOdd

    if(num % 2==0){
    return true;
    }
    { else{
    return false;
    }
    public static boolean isEven(int num){
        boolean even =num % 2 == 0;
        return even; this can work too but not the best
        simplified.

        odd example:  public static boolean isOdd(int num){
            if(num%2 !=0) return true;
            return false;// dont need else can put
     */
    public static boolean isEven(int num){
        return num %2 ==0;
    }
    public static boolean isOdd(int num){
        return num %2 ==1 ;
        }
        /*
        create a method that takes 2 int arguments and returns their sum
        Method name = sum
        public static
        return type
        returns int
        it takes 2 int
         */
        public static int sum(int num1,int num2){
            return num1 +num2;
        }
        /*
        overloading method.. instead of having two integers. can have doubl\e.
         only check method signature.
         method signature = methodName + arguments */
        public static int sum(int num1,int num2, int num3){
            return num1 +num2+num3;
        }
        public static double sum(double num1, double num2){
            return num1 + num2;
        }
        public static long sum(long num1, long num2) {
        return num1 + num2;
    }
}
