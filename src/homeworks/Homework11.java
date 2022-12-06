package homeworks;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println(" ====== Task-1 ====== ");
        String str = "    Hello    ";
        System.out.println(noSpace(str));
        System.out.println(" ====== Task-2 ====== ");
        String str2 = "Tech Global";
        System.out.println(replaceFirstLast(str2));
        System.out.println(" ====== Task-3 ====== ");
        String str3 = "java";
        System.out.println(hasVowel(str3));
        System.out.println(" ====== Task-4 ====== ");
        checkAge(2050);
        System.out.println(" ====== Task-5 ====== ");
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(" ====== Task-6 ====== ");
        String[] arr = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr)));
        System.out.println(" ====== Task-7 ====== ");
        int[] numbers7 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(numbers7)));
        System.out.println(" ====== Task-8 ====== ");
        int[] nums = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(nums));
    }
    public static String noSpace(String str1) {
        return str1.replaceAll(" ", "").trim();
    }

    public static String replaceFirstLast(String str2) {
        str2 = str2.trim();
        if (str2.length() < 2) return "";
        else
            return str2.charAt(str2.length() - 1) + str2.substring(1, str2.length() - 1) + str2.charAt(0);
    }

    public static boolean hasVowel(String str3) {
        return str3.toLowerCase().contains("a") || str3.toLowerCase().contains("e") ||
                str3.toLowerCase().contains("i") || str3.toLowerCase().contains("o") ||
                str3.toLowerCase().contains("u");
    }

    public static int checkAge(int yearOfBirth) {
        int currentYear = 2023;
        int age = currentYear - yearOfBirth;
        if (age > 100 || currentYear < yearOfBirth) System.out.println("AGE IS NOT VALID");
        else if (age < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
        return currentYear;
    }

    public static int averageOfEdges(int num1, int num2, int num3) {
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        return (max + min) / 2;
    }

    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a"))
                arr[i] = "###";
        }
        return arr;
    }

    public static int[] no3or5(int[] numbers7) {
        for (int i = 0; i < numbers7.length; i++) {
            if (numbers7[i] % 15 == 0) numbers7[i] = 101;
            else if (numbers7[i] % 5 == 0) numbers7[i] = 99;
            else if (numbers7[i] % 3 == 0) numbers7[i] = 100;
        }
        return numbers7;
    }

    public static int countPrimes(int[] arr){
        int primes = 0;
        for (int num : arr) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num /2; i++) {
                if (num % i == 0) isPrime = false;
            }
            if (isPrime) primes++;
        }
        return primes;
    }
}


