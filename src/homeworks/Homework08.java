package homeworks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("======= TASK-1 =======");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word");
        String str = scanner.nextLine();
        System.out.println(countConsonants(str));

        System.out.println("======= TASK-2 =======");
        String str2 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(str2)));

        System.out.println("======= TASK-3 =======");
        System.out.println("Please enter String");
        String str3 = scanner.nextLine();
        System.out.println(removeExtraSpaces(str3));

        System.out.println("======= TASK-4 =======");
        System.out.println("Please enter sentence");
        String sentence = scanner.nextLine();
        System.out.println(count3OrLess(sentence));

        System.out.println("======= TASK-5 =======");
        System.out.println("Please enter date of birth ");
        String dateOfBirth = scanner.nextLine();
        System.out.println(isDateFormatValid(dateOfBirth));

        System.out.println("======= TASK-6 =======");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String str6= input.nextLine();
        System.out.println(isEmailFormatValid(str6));
    }
    public static int countConsonants(String word) {
        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z&&[^aeioiuAEIou]]");
        for (char c : word.toCharArray()) {
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if (matcher.matches()) count++;
        }
        return count;
    }
    public static String[] wordArray(String str1) {
        str1 = str1.replaceAll("\\s+", " ").trim();
        String[] wordArray = str1.split(" ");
        return wordArray;
    }

    public static String removeExtraSpaces(String space) {
        return space.replaceAll("\\s+", " ");
    }

    public static int count3OrLess(String word1) {
        String[] s = word1.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(s));

        int counter =0;
        while (matcher.find()){
            counter++;
        }
        return counter;
    }
    public static boolean isDateFormatValid(String DOB ){
        Pattern pattern = Pattern.compile("[\\d]{2}/[\\d]{2}/[\\d]{4}");
        Matcher matcher = pattern.matcher(DOB);
        return matcher.matches();
    }
    public static boolean isEmailFormatValid(String email){
        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}", email));
    }
}
