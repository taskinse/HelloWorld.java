package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        // if you switch to Linkedlist the orders outcome is the same.
        //Linkedlist<String>fruits=new LinkedList<>(); linked list goes to 2 parents more functions.

        /*
        - they preserve insertion order, printed as in order system
        - they allow duplicates, same for empty, null
        - they allow null elements
        checking initial capacity.  what is the best data structure (need to know the memory), performance etc.

         -performane
         -memory
         -initial capacity
         -loads

        add elements
        /*fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits); // [Apple, Apple, Orange, , , null, null]

*/
        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");// [Pineapple, Apple, Orange]

        System.out.println(fruits.element()); //Pineapple
        System.out.println(fruits.getFirst()); //Pineapple




        System.out.println(fruits);
    }
}
