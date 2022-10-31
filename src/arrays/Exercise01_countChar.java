package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /*
        Assume you are given as below
        String word = "Java"
        ONE OPTION:
        String word = "Java";
        int count =0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a')count++;
        }
        System.out.println("Number of a's = " + count);

        2nd option:
        String word = "Java"; // [ J, a , v, a ]
        char [] wordArray = word.toCharArray(); // {'J', 'a', 'v', 'a'}
        System.out.println(Arrays.toString(wordArray));// [ J, a , v, a ]
        int countA= 0;
        for(char element : wordArray){
            if (element == 'a') countA++;
        }
        System.out.println(countA);
    }
         */
        String word = "Java"; // [ J, a , v, a ]
        int countA= 0;
        for(char element : word.toCharArray()){
            if (element == 'a') countA++;
        }
        System.out.println(countA);
    }
}
