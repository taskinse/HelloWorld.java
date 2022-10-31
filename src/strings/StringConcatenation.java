package strings;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class StringConcatenation {
    public static void main(String[] args) {
        String city;
        city= "Berlin";
        System.out.println(city);

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 +" "+ s2;
        System.out.println(s3);
        System.out.println();

        System.out.println("\n------Concatenation with + operator\n");
        String firstName = "Seyma";
        String lastName = "Taskin";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("\n------Concatenation with concat operator\n");
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);

        String wordPart1 ="le";
        String wordPart2 ="ar";
        String wordPart3 ="ning";
        System.out.println(wordPart1 +wordPart2+ wordPart3);
        /*
        TASK-2
        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        Expected output:
        I can learn Java
        */






    }
}
