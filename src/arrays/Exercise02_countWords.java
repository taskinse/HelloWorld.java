package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {
        /*
One option:
     String sentence = "I love arrays";
int countS = 0;
for (int i = 0; i < sentence.length(); i++) {
    if(sentence.charAt(i) == ' ') countS++;
}
System.out.println(countS + 1);
         */
        System.out.println("\n ------- Solution 2 with fori method ----------\n");
        String sentence = "I love arrays";
        int countS=0;
        for(char c : sentence.toCharArray()){
            if(c== ' ') countS++;
        }
        System.out.println(countS + 1);
        System.out.println("\n ------- Solution 2 with split() method ----------\n");// split from spaces
        /*String[] arr = sentence.split( " ");// when it splits gives an array with 3 elements. [ I, love, arrays]
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length); // 3
        */
        System.out.println(sentence.split( " ").length);
    }
}
