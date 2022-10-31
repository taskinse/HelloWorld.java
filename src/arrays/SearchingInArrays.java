package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 10};
        // Search for 7 and return true if it exists in this array.

        boolean has7 = false;
        for (int number : numbers) {
            if (number == 7) {
                has7 = true;
                break;
            }
        }
        System.out.println(has7);
        //Search for 5 and return true if it exists in the is array, return false otherwise -- true
        boolean has5=false;
        for(int number : numbers){
            if(number ==5){
                has5 =true;
                break;
            }
        }
        System.out.println(has5);
        System.out.println("\n--------- Binary search in arrays--------\n");
        /*
        Binary search can be used if the array is sorted Only. Otherwise, you will get wrong results.
        int[] numbers = {3, 5, 8, 10};

        if it is minus it does not exist.
        puts 11 after 10. 0,1,2,3,4.. then adds 1 makes -5.
        if the index return is zero or positive , it means the element exists.
        if the returned is negative, it means element does not exist.
        if two elements exist, then the method returns the last index.
         */
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,5));//1
        System.out.println(Arrays.binarySearch(numbers,10));//3
        System.out.println(Arrays.binarySearch(numbers,11));//-something means it doesnt exist
        System.out.println(Arrays.binarySearch(numbers,9));


    }
}
