package casting;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        ps5 - 500
        save 20 dollars per day
        expected output; 30 days buy
        currency related double.
         */
        Scanner input = new Scanner(System.in);
        double priceForPs5 = 600;
        System.out.println("The price for the PS5 is currently = $"+ priceForPs5);
        System.out.println("How much are you going to save daily?");
        double dailySave=input.nextDouble();
        System.out.println("You could buy PS5 in " + (int)(priceForPs5/dailySave) + " days.");
    }
}
