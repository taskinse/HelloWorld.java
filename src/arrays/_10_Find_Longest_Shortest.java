package arrays;

import java.util.Arrays;

public class _10_Find_Longest_Shortest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};
        printLongestShortest(colors);
    }

    public static void printLongestShortest(String[] strings) {
        /*
        1.container.. 2 containers.
        2.loop fori
        3.print
         */
        String shortStr = strings[0], longStr = strings[0];// comparing shortest, to longest. 1st one is at the start pt thats why it started with 0
        for (int i = 1; i < strings.length; i++) { // skipping the 1st one going straight to 1 because assing string [0]
            if (longStr.length() < strings[i].length()) { //my current longStr is smaller than current reasign it.
                longStr = strings[i];
            }
            if (shortStr.length() > strings[i].length()) {
                // my current shortStr is longer than current str reassign it.
                shortStr = strings[i];
            }
        }

        System.out.println("Shortest = " + shortStr);
        System.out.println("Longest = " + longStr);
    }
}

