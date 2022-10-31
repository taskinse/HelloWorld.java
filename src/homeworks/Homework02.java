package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("===== TASK 1 =====");
        int num1, num2;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hey user, please enter number 1 = ");
        num1 = inputReader.nextInt();

        System.out.println("Hey user, please enter number 2 = ");
        num2 = inputReader.nextInt();

        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));

        System.out.println("===== TASK 2 =====");
        int num3, num4;
        System.out.println("Hey user, please enter number 1 = ");
        num3 = inputReader.nextInt();
        System.out.println("Hey user, please enter number 2 = ");
        num4= inputReader.nextInt();
        System.out.println("The product of the given 2 numbers is: " + num3 * num4);

        System.out.println("===== TASK 3 =====");
        double num5,num6;
        System.out.println("Hey user, please enter number 1 = ");
        num5= inputReader.nextDouble();
        System.out.println("Hey user, please enter number 2 = ");
        num6 =inputReader.nextDouble();
        System.out.println("The sum of the given number is = " + (num5 +num6));
        System.out.println("The product of the given number is = " + num5 * num6);
        System.out.println("The subtraction of the given number is = " + (num5 - num6));
        System.out.println("The division of the given number is = " + num5 / num6);
        System.out.println("The remainder of the given number is = " + num5 % num6);

        System.out.println("===== TASK 4 =====");
        System.out.println("1.\t\t\t" +(-10+7*5));
        System.out.println("2.\t\t\t" +((72+24) % 24));
        System.out.println("3.\t\t\t" +(10+-3 * 9/9));
        System.out.println("4.\t\t\t" +(5+18/3*3-(6 % 3)));

        System.out.println("===== TASK 5 =====");
        int num7, num8;
        System.out.println("Hey user, please enter number 1 = ");
        num7 = inputReader.nextInt();
        System.out.println("Hey user, please enter number 2 = ");
        num8 = inputReader.nextInt();
        System.out.println("The average of the given number is: " +(num7+num8)/2);

        System.out.println("===== TASK 6 =====");
        int num9, num10, num11, num12, num13;
        System.out.println("Hey user, please enter number 1:");
        num9=inputReader.nextInt();
        System.out.println("Hey user, please enter number 2:");
        num10=inputReader.nextInt();
        System.out.println("Hey user, please enter number 3:");
        num11=inputReader.nextInt();
        System.out.println("Hey user, please enter number 4:");
        num12=inputReader.nextInt();
        System.out.println("Hey user, please enter number 5:");
        num13=inputReader.nextInt();
        System.out.println("The average of the given numbers is: " +(num9+num10+num11+num12+num13)/5);

        System.out.println("=====TASK 7=====");
        int num14, num15, num16;
        System.out.println("Hey user, please enter number 1:");
        num14=inputReader.nextInt();
        System.out.println("Hey user, please enter number 2:");
        num15=inputReader.nextInt();
        System.out.println("Hey user, please enter number 3:");
        num16=inputReader.nextInt();
        System.out.println("The " + num14 + " multiplied with " + num14 + " is = " + num14*num14);
        System.out.println("The " + num15 + " multiplied with " + num15 + " is = " + num15*num15);
        System.out.println("The " + num16 + " multiplied with " + num16 + " is = " + num16*num16);

        System.out.println("=====TASK 8=====");
        int sideSquare;
        System.out.println("Hey user, please enter the side of square= ");
        sideSquare=inputReader.nextInt();
        System.out.println("Perimeter of the square = "+ 4*sideSquare);
        System.out.println("Area of the square = " + sideSquare *sideSquare);

        System.out.println("=====TASK 9=====");
        double yearlySalary = 90000;
        System.out.println("A Software Engineer in Test can earn $" + yearlySalary*3 + " in 3 years." );

        System.out.println("=====TASK 10=====");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey user, please enter your favorite book =");
        String favBook = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Hey user, please enter your favorite color =");
        String favColor=scanner.nextLine();
        System.out.println("Hey user, please enter your favorite number =");
        String favNumber=scanner.nextLine();
        scanner.nextLine();
        System.out.println("\nUser's favorite book is:" + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);

        System.out.println("=====TASK 11");
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, emailAddress, address, phoneNumber;
        int age;
        System.out.println("Hey user, please enter your first name");
        firstName=inputReader.next();
        System.out.println("Hey user, please enter your last name");
        lastName=inputReader.next();
        System.out.println("Hey user, please enter your age");
        age=inputReader.nextInt();
        System.out.println("Hey user, please enter your e-mail address");
        emailAddress=inputReader.next();
        System.out.println("Hey user, please enter your phone number");
        phoneNumber=inputReader.nextLine();
        scanner.nextLine();
        System.out.println("Hey user, please enter your address");
        address=inputReader.nextLine();
        System.out.println("\tUser who joined this program is " + firstName+ " " + lastName + "."
                + firstName +"'s" + " email address is \n" + emailAddress + ",phone number is " + phoneNumber +
                ", and address is\n"+ address + ".");





    }
}
