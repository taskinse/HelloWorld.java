package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        /*
        user enter a number
        if number is more than 0 print "POSITIVE"
        if number is less than 0 print "NEGATIVE"
        Otherwise, print "ZERO"
        Zero is also positive. need to make sure the order makes sense.
        could use if else ladder, use nested if else as well.

         Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user enter number");
        int num=scanner.nextInt();

        if(num==0){
            System.out.println("ZERO");
        }
        else if(num > 0){
            System.out.println("POSITIVE");
        }
        else {
            System.out.println("NEGATIVE");
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user enter number");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("ZERO");
        } else {
            if (num < 0) {
                System.out.println("NEGATIVE");
            } else {
                System.out.println("POSITIVE");

            }
        }
    }
}
