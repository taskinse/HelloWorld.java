package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {
       /* Write a Java program that asks user to enter 2 different integers between 0 to 10 ( 0 and 10 are included)
        Print all the numbers between given 2 integers starting from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5

        when you use continue only that number that you block will be skipped. unlike break. it stops and doesn't continue
        afterwards.
        */
        int num1= ScannerHelper.getANumber();
        int num2= ScannerHelper.getANumber();
        for (int i =Math.min(num1,num2); i < Math.max(num1,num2); i++) {
            if(i==5) continue;
            System.out.println(i);
        }
        System.out.println("End of the program");
    }
}
