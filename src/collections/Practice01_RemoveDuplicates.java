package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {

        // need to come up with edge scenarios - will ask in interview
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{ -5, 10,-5, 10, 1,2,5 }))); // happypath
        /*System.out.println(Arrays.toString(removeDuplicates(new Integer[]{ -5, 10,-5, 10, 1,2,5 })));

        create a method that takes an array of numbers below
        -5, 10,-5, 10, 1,2,5
        remove all duplicates and return an array
         */
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{ -5, 10, 1,2,5 }))); // another check option
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{ }))); // empty test
    }

    /*public static Integer[] removeDuplicates(Integer[] arr) {
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer i : arr) {
            if (!uniques.contains(i)) uniques.add(i);
        }

        return uniques.toArray(new Integer[0]);

     */
    public static Integer[] removeDuplicates(Integer[] arr){
        //LinkedHashSet<Integer> hs= new LinkedHashSet<>(Arrays.asList(arr));
        //return hs.toArray(new Integer[0]);

        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]); // using to convert obect to integer. new Integer 0.
        // Integer array -> Integer List -> LinkedHashSet ->Object Array -> Integer array
    }
}
