package utilities;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerHelper {

    static Scanner input = new Scanner(System.in);
    /*
    not going to call main method this time.
    Create a method that asks user to enter a name and RETURN IT
    1st custom-made. its gray because it was not used.
     */

    public static String getAName() {
        System.out.println("Please enter a name");
        String name = input.nextLine();

        return name;

    }

    /*
    create a method that ask user to enter age and RETURN IT.
    the variables and objects can be used in that method/ that block.{}
    need to add static and reuse the scanner.
     */
    public static int getAnAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age");
        int age = input.nextInt();
        return age;

    }

    /*
    void if it gives error. because does not return anything.
     */
    public static String getAnAddress() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter address");
        String address = input.nextLine();

        return address;
    }

    public static String getAString() {
        System.out.println("Please enter a String");
        return input.nextLine();
    }

    public static String getAColor() {
        System.out.println("Please enter color");
        return input.nextLine();
    }

    public static int getANumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        return num;
    }
    public static String getAFullName() {
        System.out.println("Please enter a full name:");
        String fullName = input.nextLine();

        return fullName;
    }
    public static String getACountry(){
        System.out.println("Please enter a country: ");
        String countryName=input.nextLine();
        return countryName;
    }
}
