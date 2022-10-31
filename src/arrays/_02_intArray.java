package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {
        /*boolean [] booleans = new boolean[5]; dont know what my data is just know my size
        int[] numbers = new int[];
        to use the loops -print each element meaning. but in one line could just do sout

         for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        */

        //*1.Create an int array and store 0,-5,2,10,5,2,-1,0

        int[] numbers={0,-5,2,10,5,2,-1,0};

        //2. print array

        System.out.println(Arrays.toString(numbers));

        // 3. Iterate the array = print each element meaning
        for (int i = 0; i <= 7; i++) {
            System.out.println(numbers[i]);
        }
        // for each loop : enhanced for loop
        for( int number : numbers){
            System.out.println(number);
        }

    }
}
