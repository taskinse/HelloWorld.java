package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("====== TASK-1 ======");
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) result+=i + " - ";
        }
        System.out.println(result.substring(0,result.length()-3));
        System.out.println("====== TASK-2 ======");
        String Task2 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) Task2+= i + " - ";
        }
        System.out.println(Task2.substring(0,Task2.length()-3));
        System.out.println("====== TASK-3 ======");
        String Task3 ="";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) Task3+= i + " - ";
        }
        System.out.println(Task3.substring(0,Task3.length()-3));
        System.out.println("====== TASK-4 ======");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));
        }
        System.out.println("====== TASK-5 ======");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("====== TASK-6 ======");
        Scanner inputReader =new Scanner(System.in);

        System.out.println("Enter positive number: ");
        int num=inputReader.nextInt();
        int i=1,factorial=1;
        while(i<=num)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial of the number: " + factorial);
        System.out.println("====== TASK-7 ======");
        String fullName = ScannerHelper.getAName();
        fullName = fullName.toLowerCase();
        int count = 0;
        for (int j = 0; j < fullName.length(); j++) {
            if (fullName.charAt(j) == 'a' || fullName.charAt(j) == 'e' || fullName.charAt(j) == 'i'
                    || fullName.charAt(j) == 'o' || fullName.charAt(j) == 'u')
                count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name");

        System.out.println("====== TASK-8 ======");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        if (number2 >= 100) System.out.println("This number is already more than 100");

        while (number2 < 100) {
            System.out.println("Please enter a number");
            int number3 = scanner.nextInt();
            scanner.nextLine();
            int totalTwo = number2 + number3;
            if (totalTwo >= 100) {
                System.out.println("Sum of the entered numbers is at least 100");
            }
            break;
        }
        System.out.println("Sum of the entered numbers is at least 100");
        System.out.println("====== TASK-9 ======");
        int n = ScannerHelper.getANumber();
        String result9 = "";
        int fNum = 0, sNum = 1;
        int sumPreviousTwo;
        for (int s = 1; s <=n; s++) {
            result9+= fNum+ " - ";
            sumPreviousTwo=fNum+sNum;
            fNum=sNum;
            sNum=sumPreviousTwo;
        }
        System.out.print(result9.substring(0, result9.length() - 3));
        System.out.println("\n====== TASK-10 ======");
        String name;

        do {
            name = ScannerHelper.getAName();
        } while (name.toLowerCase().charAt(0) != 'j');

        System.out.println("End of the program");

        for (int j = 0; ; j++) {
            name = ScannerHelper.getAName();
            if (name.toLowerCase().charAt(j) == 'j'){
                System.out.println("End of program");
                break;
            }
        }
    }
}

