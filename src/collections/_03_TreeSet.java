package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {


        //Create a TreeSet object
        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago", "Miami", "New York", "San Francisco", "Los Angeles"));

        // Printing the TreeSet
        System.out.println(cities); // [Chicago, Los Angeles, Miami, New York, San Francisco]
        System.out.println(cities.headSet("Miami"));//[Chicago, Los Angeles]
        System.out.println(cities.headSet("Miami", true));//[Chicago, Los Angeles, Miami]
        // tailset is inclusive , can make it exclusive
        System.out.println(cities.tailSet("New York"));//[New York, San Francisco]
        System.out.println(cities.tailSet("New York", false));////[San Francisco]

    }
}