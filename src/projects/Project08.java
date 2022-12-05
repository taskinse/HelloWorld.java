package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {
        System.out.println(" ====== TASK-1 ======  ");
        int[] numbers = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(numbers));

        System.out.println(" ====== TASK-2 ======  ");
        int[] elements = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(elements));

        System.out.println(" ====== TASK-3 ======  ");
        String str = "Hello";
        System.out.println(findFirstUniqueCharacter(str));

        System.out.println(" ====== TASK-4 ======  ");
        int[] array = {2,3,1,5};
        System.out.println(findMissingNumber(array));
    }

    public static int findClosestDistance(int[] numbers) {
        int closestDistance = Integer.MAX_VALUE;
        if (numbers.length <= 1)
            return closestDistance = -1;
        else
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (Math.abs(numbers[i] - numbers[j]) < closestDistance)
                        closestDistance = Math.abs(numbers[i] - numbers[j]);
                }
            }
        return closestDistance;
    }

    public static int findSingleNumber(int[] element) {
        int singleValue = Integer.MAX_VALUE;
        for (int i = 0; i < element.length; i++) {
            for (int j = i + 1; j < element.length; j++) {
                if (element[i] != element[j])
                    singleValue = element[i];
            }
        }
        return singleValue;
    }

    public static char findFirstUniqueCharacter(String str) {
        char singleChar = ' ';
        for (int i = 0; i < str.length()-1; i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
                singleChar = str.charAt(i);
            break;
        }
        return singleChar;
    }

    public static int findMissingNumber(int[] array) {
        Arrays.sort(array);
        int missingNum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i] - array[i + 1]) != 1) {
                missingNum = array[i] + 1;
            }
        }
        return missingNum;
    }
}




