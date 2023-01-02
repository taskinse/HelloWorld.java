package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        /*
        only 4 elements can see. no second dull and 5.
        no insertion order.
        can't get it at index because no get method.
        the first 5 will go to the place. thats why we get the order.
        after the 6th the pattern is unpredictable

         */
        HashSet<Integer>hashSet=new HashSet<>();
        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
        TreeSet<Integer>treeSet=new TreeSet<>();

        System.out.println("==== hashSet ====");
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet); // [0, null, 5, 10]

        System.out.println("==== linkedhashset ====");
        linkedHashSet.add(5);
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);//[5, 10, 0, null] no duplicates, order as writen.

        System.out.println("==== treeSet ====");
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(0);
        //treeSet.add(null);NullPointerException
        //treeSet.add(null);NullPointerException

        System.out.println(treeSet); //[0, 5, 10] sorted and order. null took out bc of exception.
    }
}
