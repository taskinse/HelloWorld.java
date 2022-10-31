package scanner_programs;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter your address");
        String address = scanner.nextLine();

        System.out.println("Age is = " + age);
        System.out.println("Address is = " + address);

        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        System.out.println(num1/ num2);



    }
}
