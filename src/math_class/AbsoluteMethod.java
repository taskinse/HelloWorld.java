package math_class;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args){
        System.out.println("Difference between your numbers =" + Math.abs(10-14));
        System.out.println("Difference between your numbers =" + Math.abs(14-10));
        System.out.println("Subtraction between your numbers =" + (10-14));

        /*
        Write a program asks user two ages and gets the difference between ages and print them.
         */
        Scanner numberTaker = new Scanner(System.in);
        System.out.println("Please enter an age");
        int age1 = numberTaker.nextInt();
        System.out.println("Pleae enter another age");
        int age2= numberTaker.nextInt();
        System.out.println("Difference between your age is  = " +Math.abs(age1-age2));
        System.out.println("Biggest age is  = " +Math.max(age1,age2));
        System.out.println("Youngest age is  = " +Math.min(age1,age2));
    }
}
