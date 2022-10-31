package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println(" ----- TASK-1 -----");

        int[] numbers = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println(" ----- TASK-2 -----");
        String[] assign = new String[5];
        assign[1] = "abc";
        assign[4] = "xyx";

        System.out.println(assign[3]);
        System.out.println(assign[0]);
        System.out.println(assign[4]);
        System.out.println(Arrays.toString(assign));

        System.out.println(" ----- TASK-3 -----");
        int[] numbers2 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        System.out.println(" ----- TASK-4 -----");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println(" ----- TASK-5 -----");
        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));
        boolean hasDogs = false;
        for (String dog : dogs)
            if (dog.equals("Pluto")) {
                hasDogs = true;
                break;
            }
        System.out.println(hasDogs);
        System.out.println(" ----- TASK-6 -----");
        String[] cat = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cat);
        System.out.println(Arrays.toString(cat));
        System.out.println(Arrays.binarySearch(cat, "Garfield") + Arrays.binarySearch(cat, "Felix") >= 0);

        System.out.println(" ----- TASK-7 -----");
        double[] numbers3 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbers3));
        for (int i = 0; i <= numbers3.length; i++) {
            System.out.println(numbers3[i]);
            System.out.println(" ----- TASK-8 -----");
            char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
            System.out.println(Arrays.toString(characters));
            int letter = 0;

            for (char character : characters) {
                if (Character.isLetter(character)) letter++;
            }
            System.out.println("Letters = " + letter);
            int countUpper = 0;
            for (char character : characters) {
                if (Character.isUpperCase(character)) countUpper++;
            }
            System.out.println("Uppercase letters = " + countUpper);

            int countLower = 0;
            for (char character : characters) {
                if (Character.isLowerCase(character)) countLower++;
            }
            System.out.println("Lowercase letters = " + countLower);

            int digits = 0;
            for (char character : characters) {
                if (Character.isDigit(character)) digits++;
            }
            System.out.println("Digits = " + digits);

            int specialCharacters = 0;
            for (char character : characters) {
                if (Character.isLetter(character) == Character.isDigit(character)) specialCharacters++;
            }
            System.out.println("Special characters = " + specialCharacters);

            System.out.println(" ----- TASK-9 -----");
            String[] objects2 = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
            System.out.println(Arrays.toString(objects2));
            int cUpper = 0;
            for (String object : objects2) {
                if (Character.isUpperCase(object.charAt(0))) cUpper++;
            }
            System.out.println("Elements starts with uppercase = " + cUpper);
            int lUpper = 0;
            for (String object : objects2) {
                if (Character.isLowerCase(object.charAt(0))) lUpper++;
            }
            System.out.println("Elements starts with lowercase = " + lUpper);
            int countBP = 0;
            for (String object : objects2) {
                if (object.toLowerCase().startsWith("b") || object.toLowerCase().startsWith("p")) countBP++;
            }
            System.out.println("Elements starting with B or P = " + countBP);
            int countWord = 0;
            for (String object : objects2) {
                if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) countWord++;
            }
            System.out.println("Elements having book or pen = " + countWord);
            System.out.println(" ----- TASK-10 -----");
            int[] numbers4 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
            System.out.println(Arrays.toString(numbers4));
            int count = 0;
            for (int k = 0; i < numbers4.length; k++) {
                if (numbers4[k] > 10) count++;
            }
            System.out.println("Elements that are more than 10 = " + count);
            int count2 = 0;
            for (int k = 0; k < numbers4.length; k++) {
                if (numbers4[k] < 10) count2++;
            }
            System.out.println("Elements that are less 10 = " + count2);
            int count3 = 0;
            for (int k = 0; k < numbers4.length; k++) {
                if (numbers4[k] == 10) count3++;
            }
            System.out.println("Elements that are 10 = " + count3);
            System.out.println(" ----- TASK-11 -----");
            int[] numbers5 = {5, 8, 13, 1, 2};
            int[] numbers6 = {9, 3, 67, 1, 0};
            int[] numberTotal = new int[5];

            System.out.println("1st array is = " + Arrays.toString(numbers5));
            System.out.println("2nd array is = " + Arrays.toString(numbers6));

            for (int s = 0; s < numbers5.length; s++) {
                numberTotal[s] = Math.max(numbers5[s], numbers6[s]);
            }
            System.out.println("3rd array is =" + Arrays.toString(numberTotal));
        }
    }
}