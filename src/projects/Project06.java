package projects;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("======= TASK-1 =======");
        String[] words = {"foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby "};
        System.out.println(countMultipleWords(words));

        System.out.println("======= TASK-2 =======");
        ArrayList<Integer> negatives = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(negatives));

        System.out.println("======= TASK-3 =======");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String str = input.nextLine();
        char s[] = str.toCharArray();
        System.out.println(validatePassword(s));

        System.out.println("======= TASK-4 =======");
        System.out.println("Please enter valid email");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        System.out.println(validateEmailAddress(email));
    }
    public static int countMultipleWords(String[] matching) {
        Pattern pattern = Pattern.compile("(?i)\\b[a-z]+\\b");
        int count = 0;
        for (int i = 0; i < matching.length; i++) {
            Matcher matcher = pattern.matcher(matching[i]);
            int word = 0;
            while (matcher.find()) {
                word++;
            }
            if (word > 1) count++;
        }
        return count;
    }
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> negatives) {
        Iterator<Integer> iterator = negatives.iterator();
        while (iterator.hasNext()) {
            Integer negative = iterator.next();
            if (negative < 0) {
                iterator.remove();
            }
        }
        return negatives;
    }
    public static String validatePassword(char s []) {
        int counter = 0;
        if(s.length < 6 || s.length > 20){
            return "Invalid";
        }
        for(int i = 0 ; i < s.length ; i++){
            if(s[i] == '@' || s[i] == '#' || s[i] == '$'|| s[i] == '0' || s[i] == '1' || s[i] == '2' || s[i] == '3' || s[i] == '4' || s[i] == '5' || s[i] == '6'|| s[i] == '7'|| s[i] == '8'|| s[i] == '9'){
                counter = 0;
                break;
            }
            counter = 1;
            if(counter == 1){
                return "false";
            }
        }
        return "true";
    }
    public static boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile("\\w{2,}@\\w{2,}\\.\\S{2,}");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

