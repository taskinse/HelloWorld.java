package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise1_MathGrade {
    public static void main(String[] args) {
/*
Assume David took a math exam and the passing grade for the exam was 60.

Write a program that asks David what his grade is. If David’s grade is greater than or equal to 60,
then print message “Awesome! You have passed the math class!”.

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Hey David!Please enter your math grade");
        int examResult = input.nextInt();
        if (examResult >= 60) {
            System.out.println("Awesome! You have passed the math class!");

        } else {
            System.out.println("sorry!You failed!");
        }
        System.out.println("End of the program");
    }
}