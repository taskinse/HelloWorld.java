package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
       /* Write a Java program to ask user to enter a number and print
        all the odd numbers starting from 0 to given number by user
                (0 and given number is included)
3,10
        start pt:0
        end pt: not determined
        upscale: increment
        start point: smallest number (smallest)
        end point : largest number (greatest)
        update: increment

           for(int i = Math.min(num1,num2); i<= Math.min(num1,num2); i++);{
            if(i % 2 ==0) System.out.println(i);
   */
        int num1 = ScannerHelper.getANumber();
        int num2 = ScannerHelper.getANumber();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 == 0) System.out.println(i);

        }
    }
}