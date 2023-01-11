package homeworks;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println(" ======= Task-1 ======= ");
        fizzBuzz1(5);
        System.out.println(" ======= Task-2 ======= ");
        fizzBuzz2(3);
        System.out.println(" ======= Task-3 ======= ");
        System.out.println(findSumNumbers("a1b4c 6#"));
        System.out.println(" ======= Task-4 ======= ");
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(" ======= Task-5 ======= ");
        System.out.println(countSequenceOfCharacters("abbcca"));
    }

    public static void fizzBuzz1(int x) {
        for (int i = 1; i <= x; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

    public static void fizzBuzz2(int number) {
        for (int i = 3; i <= 3; i++)
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(number);
    }

    public static int findSumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt("" + str.charAt(i));
        }
        return sum;
    }
    public static int findBiggestNumber(String str) {
        int max=0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                num=(num*10)+ Integer.parseInt(""+ str.charAt(i));
                max=Math.max(num,max);
        }
            else{
                num=0;
            }
        }
        return max;
}
    public static String countSequenceOfCharacters(String str){
        if(str.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else {
                count++;
                result.append(count).append(str.charAt(i));
                count=0;
            }
        }
        return result.toString();
    }
}

