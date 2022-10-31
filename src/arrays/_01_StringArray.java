package arrays;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {
        //1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        //2.assigning values to specific indexes
        countries[1] ="Spain";

        //3.Print a specific index from an array
        System.out.println(countries[0]);
        System.out.println(countries[1]);

        //4. Printing an array
        System.out.println(Arrays.toString(countries));//[null, Spain, null]
        /*
        Assign Belgium to index of 2
         */
        countries[2]="Belgium";
        System.out.println(Arrays.toString(countries));

        //5. Update existing element
        countries[1]="France";
        System.out.println(Arrays.toString(countries));

        //6. Getting teh length of an array - how many elements-3. this length is a instant variable doesnt have paranthesis. length of array
        /* int i = countries.length;
         System.out.println(i); // can put in i variable and solve
         */

        System.out.println(countries.length); //3
        /*
        countries[3]="Germany"; // getting an arrayIndexOutofBounds.
        System.out.println(Arrays.toString(countries));
        countries=new String[4]; // adding a new one to addition
        countries[3]="Germany";
        */

        System.out.println(Arrays.toString(countries));
        // printing each element separately
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // France
        System.out.println(countries[2]); // Belgium

        for (int i = 0; i <= 2; i++) {
            System.out.println("Country at index of " + i + " is = " + countries[i]);
        }
    }
}
