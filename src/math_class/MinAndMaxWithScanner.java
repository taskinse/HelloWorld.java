package math_class;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {
        /*
        Get 2 numbers from user and find their max and min then print them with messages
max of your number =15
min of your number is 10
      ask a user anything need to create scanner object.

      can give any variable. can use input
      Scanner scanner
      scanner input
      scan all the object needs to be scan


         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user give me a number");
        int num1 = scanner.nextInt();
        System.out.println("Hey user give me another number");
        int num2= scanner.nextInt();
        System.out.println("Hey user give me your third number");
        int num3=scanner.nextInt();
        System.out.println("Your first number is = " +num1);
        System.out.println("Your second number is = " +num2);
        System.out.println("Your third number is = " + num3);
        System.out.println("Max of your numbers is " +Math.max(num1,num2));
        System.out.println("Min of your numbers is " + Math.min(num1, num2));
        System.out.println("Max of your numbers is " + Math.max(Math.max(num1, num2), num3));
        System.out.println("Min of your numbers is " + Math.min(Math.min(num1,num2),num3));






    }
}
