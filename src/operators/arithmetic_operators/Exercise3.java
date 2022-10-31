package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        how user, how much you make yearly?

         */

        Scanner input = new Scanner(System.in);
        double yearlySalary;

        System.out.println("Hey user, how much you make yearly?");
        yearlySalary = input.nextDouble();
        System.out.println("Your monthly payment is " + yearlySalary/ 12 + " then!");



    }
}
