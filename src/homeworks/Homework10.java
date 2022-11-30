package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {

    public static void main(String[] args) {
        System.out.println(" ======= Task-1 ======= ");
        String str = "      Java is fun          ";
        System.out.println(countWords(str));

        System.out.println(" ======= Task-2 ======= ");
        String str2 = "TechGlobal is a QA bootcamp";
        System.out.println(countA(str2));

        System.out.println(" ======= Task-3 ======= ");
        ArrayList<Integer> number3 = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(number3));

        System.out.println(" ======= Task-4 ======= ");
        ArrayList<Integer> number4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(number4));

        System.out.println(" ======= Task-5 ======= ");
        ArrayList<String> str5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(str5));

        System.out.println(" ======= Task-6 ======= ");
        String str6 = "Java is fun    ";
        System.out.println(removeExtraSpaces(str6));

        System.out.println(" ======= Task-7 ======= ");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println(" ======= Task-8 ======= ");
        int[] numbers = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(numbers));
    }

    public static int countWords(String s) {
        String[] words = s.trim().split(" ");
        return words.length;
    }

    public static int countA(String a) {
        int countA = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }

    public static int countPos(ArrayList<Integer> numbers) {
        int countPos = 0;
        for (Integer number : numbers) {
            if (number > 0) countPos++;
        }
        return countPos;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> rdublicate = new ArrayList<>();
        for (Integer integer : numbers) {
            if (!rdublicate.contains(integer)) rdublicate.add(integer);
        }
        return rdublicate;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str) {
        ArrayList<String> noDups = new ArrayList<>();
        for (String s : str) {
            if (!noDups.contains(s)) noDups.add(s);
        }
        return noDups;
    }

    public static String removeExtraSpaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }

    public static int[] add(int[] numbers1, int[] numbers2) {
        int[] sum;
        if (numbers1.length > numbers2.length) {
            for (int i = 0; i < numbers2.length; i++) {
                numbers1[i] = numbers1[i] + numbers2[i];
            }
            sum = numbers1;
        } else {
            for (int i = 0; i < numbers1.length; i++) {
                numbers2[i] = numbers1[i] + numbers2[i];
            }
            sum = numbers2;
        }
        return sum;
    }
    public static int findClosestTo10(int[] numbers8) {
        int difference = Integer.MAX_VALUE;
        int closest = 0;
        for (int number : numbers8) {
            if (Math.abs(10 - number) <= difference && number != 10) {
                if (difference == Math.abs(10 - number)) {
                    closest = Math.min(closest, number);
                } else {
                    difference = Math.abs(10 - number);
                    closest = number;
                }
            }
        }
        return closest;
    }
}
