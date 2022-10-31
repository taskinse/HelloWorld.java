package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // 1.5, 2.3,
        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char [] chars = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);

        // change the values  to {-3.7, -1.3, 1.5, 2.3};

        Arrays.sort(decimals);
        System.out.println("Arrays after sorting " + Arrays.toString(decimals));
        /*output:
        -3.7
        -1.3
        1.3
        2.3
        System.out.println(decimals[i]);
         */
        System.out.println("\nFori loop print below: ");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]); // not using arrays.tostring because long
        }
        System.out.println("\nFor each loop print below");
        for (double d : decimals) {
            System.out.println(d);

            /*output:
        -3.7 -a -> at the index 0
        -1.3
        1.3
        2.3
             */
            for (int i = 0; i < decimals.length; i++) {
                System.out.println(decimals[i] + " - " + chars[i]);

            }
        }
    }
}
