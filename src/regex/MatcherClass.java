package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("SDET");
        Matcher matcher = pattern.matcher("TechGlobal provides students a complete educational program to be a competitive SDET in the professional IT field. With the course, students learn all the fundamental technologies needed to become an SDET professional and how important testing is in the Software Development Life Cycle (SDLC)… Learn more about the technologies that TechGlobal provides to its participants below and feel free to reach out to us with any questions.");
/*
        System.out.println(matcher.matches());
        System.out.println(matcher.find());
        System.out.println(matcher.group()); // will find it and print it out
        System.out.println("Starting index: " + matcher.start());
        System.out.println("Ending index: " + matcher.end());

        System.out.println(matcher.find()); // finds the  next word
        System.out.println(matcher.group());
        System.out.println("Starting index: " + matcher.start());
        System.out.println("Ending index: " + matcher.end());
        // gives an error the third time because can't find SDET anymore giving an compiler error.
        System.out.println(matcher.find());
        System.out.println(matcher.group());
        System.out.println("Starting index: " + matcher.start());
        System.out.println("Ending index: " + matcher.end());
*/
        System.out.println(matcher.matches());
        int counter =0;

        while(matcher.find()){
            counter++;
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
        System.out.println(counter);

        System.out.println("====== task 1 ==========");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern2 = Pattern.compile("[A-Za-z]{1,}"); // 1 to more meaning .. meaning 1 to the biggest word. miminum is 1.
        System.out.println("Please print out a sentence");
        String sentence =scanner.nextLine();
        Matcher matcher2 = pattern2.matcher(sentence);
        int counter2 =0; // container
        while(matcher2.find()){

            System.out.println(matcher2.group());// to print out the words.
            counter2++;
        }
        System.out.println("This sentence contains " + counter2 + " words");

        System.out.println(" ====== exercise ======");
        System.out.println(Pattern.matches("[a-zA-Z0-9-_]{9,15}", "TechGlobal")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9-_]{9,15}", "TechGlobal_---------")); // false doesnt fit in the length.


    }
}
