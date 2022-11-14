package regex;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println("===== TASK -1========");
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}","JohnDoe_123")); // true within the range
        System.out.println(Pattern.matches("[\\w-]{8,15}","JohnDoe_123"));//shortcut anynumber letter,underscore
        System.out.println(Pattern.matches("[\\d]{8,15}","59393"));// shortcut for numbers.
        System.out.println(Pattern.matches(".+","JohnDoe1$3k"));// . works with everything.. + telling giving String one or more characters

        // write a regex statement NNN-NN-NNNN
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}","139-98-7682"));// need to add dash for each bracket
        System.out.println(Pattern.matches("[\\d-]{3}[\\d-]{2}[\\d]{4}","139-98-7682"));// also indicates all could be dashes since inside the bracket

        System.out.println("===== TASK -2========");
        /*
        Write a regex pattern for a phone number with the format of:
        (XXX)-XXX-XXXX.. alternative formats
         */
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}","(139)-222-3333"));
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","(139)-222-3333"));
        System.out.println(Pattern.matches("[(]?[\\d]{3}[(]?-[\\d]{3}-[\\d]{4}","(139)-222-3333"));

        // remove all in the string pattern
        //How much wood would a wood chuck chuck if a wood chuck could chuck wood
        //replace wood with ****
        //How much **** would a **** chuck chuck if a **** chuck could chuck ****

        System.out.println("===== TASK 3=======");
        String sentence="How much wood would a wood chuck chuck if a wood chuck could chuck wood";
        System.out.println(sentence.replace("wood","****"));
        // replace ALL
        System.out.println(sentence.replaceAll("wood","****")); // if put in bracket will replace all the letters in the sentence
        // rejects ReplaceALL helps when put in [] it replacess all the it sees

        System.out.println("===== TASK 4=======");
        //Remove all special characters
        String str= " abc 123 $#^ ";
        System.out.println(str.replaceAll("[ $#^]", "")); // works but not dynamic
        System.out.println(str.replaceAll("[\\W]", ""));
        System.out.println(str.replaceAll("[\\D\\W]", ""));
        System.out.println(str.replaceAll("[\\W_]", ""));// good
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));// good

        System.out.println("\n============Task5===========\n");

        //crate a Regex pattern that checks for a first and last name.. 2Letters+2Letters.
        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}", "John Doe")); // space between the 2 indicates spaces
        System.out.println(Pattern.matches("[A-Za-z ]{2,}", " JohnDoe")); // issue space can be in front or back
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+", "John Doe"));//up&lowercase.

        str = "##A1%%b2#$%C^&3";
        //[A, b, C]
        //[1, 2, 3]
        System.out.println(Arrays.toString(str.replaceAll("[^A-Za-z]","").toCharArray()));//AbC..^not[] need to make array
        System.out.println(Arrays.toString(str.replaceAll("[\\D]","").split("")));//A123
        System.out.println(Arrays.toString(str.replaceAll("[^0-9]","").split("")));






    }
}
