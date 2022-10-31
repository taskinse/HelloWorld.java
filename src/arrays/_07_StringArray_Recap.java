package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {
        //String array with length of 4 ( new without curly)

        String [] fruits = new String[4];
        System.out.println(Arrays.toString(fruits)); // defualt value is printed out null .. need to assing now

        // assign "Apple" to index of 0
        //assing "Kiwi" to index of 3
        // Then print array again

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";
        System.out.println(Arrays.toString(fruits));

        // assign "Grapes" to index of 1
        //assing "Orange" to index of 2

        fruits[1] = "Grapes";
        fruits[2] = "Orange";
        System.out.println(Arrays.toString(fruits));

        System.out.println("\nReassigning values: ");
        //Reassing Apple to index of 3 and index of 2
        // [Apple, Grapes, Orange, Kiwi] --- [Apple, Grapes, Apple, Apple]

        fruits[3] = fruits[0]; // what is changing to what is the apple
        fruits[2] = fruits[0];// what is changing to what is the apple
        System.out.println(Arrays.toString(fruits));

        System.out.println("\nPrinting values with for each loop: ");
        for (String fruit:fruits) {
            System.out.println(fruit);
        }
    }
}
