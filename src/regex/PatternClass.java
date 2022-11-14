package regex;

import utilities.ScannerHelper;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}"); // condition will accep ta to z and all numbers and characters long 5
        System.out.println(pattern); // returns the pattern
        System.out.println(pattern.pattern()); // returns the pattern as a string
        System.out.println(pattern.toString()); // returns the pattern as a string

        System.out.println(Pattern.matches(pattern.pattern(), "hello world"));// false because the character is long 12 btwn range
        System.out.println(Pattern.matches(pattern.pattern(), "Apple 1"));//this is false but will be change the result true if[A-Za-z0-9]{5,10}")
        // can switch up by "Apple".toLowerCase() making it true.. beginning "apple"in the regex.

        String str = " I go to school at TechGlobal and I love it";
        String [] arr = str.split("[a-z0-9]{5,10}");
        System.out.println(Arrays.toString(arr));

        System.out.println("======== EX1 =========");
        String name = ScannerHelper.getAName();
        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]{5,10}");
            if(Pattern.matches(pattern2.pattern(),name)){
                System.out.println("Valid Username");
        }
        else System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");



    }
}
