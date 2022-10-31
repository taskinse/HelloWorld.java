package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise2_EvenOrOdd {
    public static void main(String[] args) {
        /*

Write a program that asks user to enter a number.
If the number entered is even, then print message “The number you entered is even!”

         */
    Scanner input= new Scanner(System.in);
        System.out.println("Pleas enter a number?");
    int num=input.nextInt();
    if(num%2 ==1){ // this means odd
        System.out.println("The number you entered is out!");
    }
    else{
        System.out.println("The number you entered is even!");
    }
        System.out.println("End of the program");
    }
}
