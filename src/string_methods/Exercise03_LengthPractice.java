package string_methods;

import utilities.ScannerHelper;

public class Exercise03_LengthPractice {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their favorite book name and quote
        And store answers of user in different Strings
        Finally, print the length of those Strings with proper messages

        Assume user entered "Java and "C#"
        Expected output:
        The length of the first string = 4
        The length of the second string = 2

         */
        String str1 = ScannerHelper.getAString();
        String str2 = ScannerHelper.getAString();

        System.out.println("The length of the first string = " + str1.length());
        System.out.println("The length of the second string = " +str2.length());
    }
}
