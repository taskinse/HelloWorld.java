package methods;

import utilities.ScannerHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {
        /*
        deleted the below statement.
        Scanner input= new Scanner(System.in);
        System.out.println("Hey, please enter a name");
        String name=input.nextLine();
        issue deleted the input.
        System.out.println("Hey, please enter an age");
        int age= input.nextInt();
        System.out.println(name + "'s age is " + age + ".");
        dont need to ask scanner to come in. repeated code use again
        again and class and call from there and reuse.
         */
        String name= ScannerHelper.getAName();
        System.out.println("The name is = " +name);

        int age= ScannerHelper.getAnAge();
        String adress=ScannerHelper.getAnAddress();

        System.out.println(name+ "'s age is " +age +" .");
        System.out.println(ScannerHelper.getAName()+ "'s age is " +ScannerHelper.getAnAge()
                    +"\n" + "Address is " +ScannerHelper.getAnAddress());


    }
}
