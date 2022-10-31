package practice.arraysPractice;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // [[1,1] , [2,4], [3,9]] ==> outer size =3, inner size= 2
        int [][] numbersSquare = new int[3][2];
        int[][] numbersSquare2 = {{1, 1}, {2, 4}, {3, 9}};
        System.out.println(Arrays.deepToString(numbersSquare));
        System.out.println(Arrays.deepToString(numbersSquare2));
/*
      int [][] numbersSquare = new int[3][2];
        System.out.println(Arrays.deepToString(numbersSquare));
        array of emptines.. outcome. [null, null, null]
 */




    }

}
