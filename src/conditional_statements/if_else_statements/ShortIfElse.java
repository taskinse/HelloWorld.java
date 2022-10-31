package conditional_statements.if_else_statements;

import java.util.Scanner;

public class ShortIfElse {
    public static void main(String[] args) {
        /*
       write a program that as user to enter 2 different numbers
        find the max and print with message below:
         Scanner input= new Scanner(System.in);
        System.out.println("Please enter 2 different numbers");
        int num1=input.nextInt(), num2=input.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is the greatest");
        }
        else{
            System.out.println(num2 + " is the greatest");
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter 2 different numbers");
        int num1=input.nextInt(), num2=input.nextInt();

        int greatest=0;
        if(num1>num2) greatest =num1;
        else greatest =num2;
            System.out.println(greatest + " is the greatest");

        System.out.println("End of the program ");
    }
}
