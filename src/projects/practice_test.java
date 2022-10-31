package projects;

import utilities.ScannerHelper;

public class practice_test {
    public static void main(String[] args) {
        String word = ScannerHelper.getAString();
        String newWord = "";
        if (word.length() < 1) {
            System.out.println("This word does not have 1 or more characters. ");
        } else {
            for (int j = word.length() - 1; j >= 0; j--) {
                newWord = newWord + word.charAt(j);
            }
            if (word.equals(newWord)) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is not a palindrome");
            }
        }
        String sentence = ScannerHelper.getAString();
        int count = 0;
        if (sentence.length() < 2) {
            System.out.println("This sentence does not have multiple words.");
        }
        else
        {
            for (int i = 0; i < sentence.length(); i++) {
                if ((sentence.charAt(i))==(' ')){
                    count++;
                }
            }
            System.out.println("This sentence has = " + (count + 1));
        }
    }
}
