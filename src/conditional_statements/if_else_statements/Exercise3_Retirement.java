package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise3_Retirement {
    public static void main(String[] args) {
        /*
        retirement example - 55 or greater. 3 test cases. one 55, one less, one more.

         */
        Scanner inputReader=new Scanner(System.in);
        System.out.println("Please enter your age?");
        int age=inputReader.nextInt();
        if (age>=55){
            System.out.println("It is your time to get retired!");
        }
        else{
            int difference =55-age;
            if(difference==1){
                System.out.println("You have 1 year to be retired");
            }
            else{
                System.out.println("You have " +difference + " years to be retired");
            }

        }
    }
}
