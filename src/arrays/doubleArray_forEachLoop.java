package arrays;

import java.util.Arrays;

public class doubleArray_forEachLoop {
    public static void main(String[] args) {
        //1.create an array to store->5.5,6,10.3,25
        double [] numbers={5.5,6,10.3,25};
        //2.Print the array ->[5.5,6,10.3,25]
        System.out.println(Arrays.toString(numbers));
        //3.Print the size of the array -->4 .. its asking for the length. no paranthesis in length
        System.out.println(numbers.length);
        System.out.println("\n------- for -each loop -------\n");
        for(double number : numbers){
            System.out.println(number);
        }
    }
}
