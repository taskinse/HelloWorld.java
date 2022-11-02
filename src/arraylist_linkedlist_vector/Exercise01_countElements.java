package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below colors
    Blue
    Brown
    Pink
    Yellow
    Red
    Purple
         */
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));
        /*colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

         */
        System.out.println(colors);
        System.out.println(colors.size());

        for (String color:colors) {
            System.out.println(color);
          /*
        Count the elements that has length of 6
        EXPECTED:
        2
         */

            System.out.println("\n------TASK-2 - Elements that has length of 6-------\n");
            int count6 =0;
            for (String color2: colors) {
                if (color2.length() == 6) count6++;
            }
            System.out.println(count6);
            int count7=0;
            for (int i = 0; i < colors.size(); i++) { // stop at color size.
            if(colors.get(i).length() == 6) count7++;  // the color itsize.. need the length of it.
            }
            System.out.println(count7);
            /*
            count the elements that have 'o'
            expected : 2 // brown and yellow
             */
            int count=0;
            for (String color1:colors) {
                if(color1.toLowerCase().contains("o"))count++;
            }
            System.out.println(count);
            int count2=0;
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i).toLowerCase().contains("o"))count2++;
            }
            System.out.println(count2);
        }
    }
}
