package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Collections;

public class _05_containsAll_retainAll_method {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        System.out.println(countries.contains("Spain"));
        System.out.println(countries.indexOf("Spain")!=-1);// another format

        /*
        Sweeden & Denmark
         */

        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));

        boolean hasSweden = false, hasDenmark =false;

        for (String country:countries) {
            if (country.equals("Sweden")) hasSweden=true;
            else if (country.equals("Denmark")) hasDenmark=true;

            if(hasDenmark && hasSweden) break;
        }
        System.out.println(hasDenmark && hasSweden);

        ArrayList<String>europeCountries= new ArrayList<>();
        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");
        europeCountries.add("Italy");

        System.out.println(countries.containsAll(europeCountries));
        // Retain All Collection .. US and Canada is excluded because not in the given collection
        countries.retainAll(europeCountries);// retains and hold the rest
        System.out.println(countries);//[Italy, Germany, Spain, Portugal, Sweden].. US and Canada is out.

        // Sorting.
        Collections.sort(countries);
        System.out.println(countries);//[Germany, Italy, Portugal, Spain, Sweden]

    }
}
