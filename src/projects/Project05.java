package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("===== TASK-1 =====");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);

        System.out.println("===== TASK-2 =====");
        int[] numbers2 = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallest(numbers2);

        System.out.println("===== TASK-3 =====");
        int[] numbers1 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers1);

        System.out.println("===== TASK-4 =====");
        int[] numbers4 ={10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(numbers4);

        System.out.println("===== TASK-5 =====");
        String[] word = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(word);

        System.out.println("===== TASK-6 =====");
        String[] element = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(element);

    }
    public static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }
    public static void findGreatestAndSmallest(int[]numbers2) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers2) {
            if (number > max)
                max = number;
            if (number < min)
                min = number;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }
    public static void findSecondGreatestAndSmallestWithSort(int[] numbers1) {
        Arrays.sort(numbers1);
        int min= numbers1[0];
        int max= numbers1[numbers1.length-1];
        int secondMin=0;
        int secondMax=0;
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i] !=min){
                secondMin=numbers1[i];
                break;
            }
        }
        for (int i = 0; i < numbers1.length-2; i++) {
            if (numbers1[i] != max) {
                secondMax = numbers1[i];
                break;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }
    public static void findSecondGreatestAndSmallest(int[] numbers4) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int number : numbers4) {
            if (number > secondMax && number < max){
                secondMax = number;
            }
            if (number < secondMin && number > min){
                secondMin = number;
            }
        }
        System.out.println("Second smallest = " + secondMin);
        System.out.println("Second greatest = " + secondMax);
    }
    public static void findDuplicatedElementsInAnArray(String[] word) {
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j]))
                    System.out.println(word[j]);
            }
        }
    }
        public static void findMostRepeatedElementInAnArray (String[]element){
            int maxCount = 0;
            String mostRepeated = "";
            for (int i = 0; i < element.length; i++){
                int count = 0;
                for (int j = 0; j < element.length; j++){
                    if (element[i].equals(element[j])) {
                        count++;
                    }
                }
                if (count > maxCount){
                    maxCount = count;
                    mostRepeated = element[i];
                }
            }
            System.out.println(mostRepeated);
        }
    }





