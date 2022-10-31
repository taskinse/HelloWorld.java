package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _09_Find_Max_Min {
    public static void main(String[] args) {
        int[] numbers = {5,3,2,4,7,-5};
        printMaxAndMinWithSort(numbers);
        printMaxAndMinWithoutSort(numbers);
    }

    /*
create public static method which will take an int array then it will find the
max and min numbers from there and print it.

Examples:
    Array ->   int[] numbers = {5, 3, 2, 4, 7, -5};

Output:
    Max = 7
    Min = -5

NOTE: DO IT WITH AND WITHOUT SORT METHOD (2 WAYS IN TOTAL)
method names:
    *printMaxAndMinWithSort
    *printMaxAndMinWithoutSort
     */

    public static void printMaxAndMinWithSort (int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Max = " + numbers[numbers.length-1]);
        System.out.println("Min= " + numbers[0]);
    }

    public static void printMaxAndMinWithoutSort(int[] numbers){
//containers (max, min).. loop(if my current max is bigger than the current number)... print
        int min = Integer.MAX_VALUE; // check the max value .. definitely will change.. mininmum value we can get.
        int max = Integer.MIN_VALUE; //
        for (int n:numbers) {
if (max < n){
    max = n;
}
if(min > n){
    min = n; // min has to change for n.
}
        }
        System.out.println("Max is = "  + max);
        System.out.println("Min is = "  + min);
    }
}
