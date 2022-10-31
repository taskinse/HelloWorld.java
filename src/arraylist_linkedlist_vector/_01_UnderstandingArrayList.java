package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {
        // 1. Declaring an array vs. arranlist
        String[] names1=new String [3];
        ArrayList< String> names2= new ArrayList<>();// capacity by default;
        //2. Getting the size of the array vs.ArrayList
        System.out.println("The size of the array " + names1.length);
        System.out.println("The size of the array " + names2.size());
        //3. Printing an array vs. ArrayList
        System.out.println("\n----- Printing array vs ArrayList----\n");
        System.out.println("The array = " + Arrays.toString(names1)); //[null,null,null]
        System.out.println("The ArrayList = " + names2);//[]
        //4.Adding elements to specific indexes
        names1[0] ="Alex";
        names2.add(0,"John");//names2.add("John");

        System.out.println("\n-------Printing array vs ArrayList ------\n");
        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        names1[1]= "Ali"; // array
        names1[2]="Andrii";// array
        names2.add(1,"Joe");// Arraylist is in this format.. use add method
        names2.add(2, "Jane");
        System.out.println("The array = " +Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        names2.add(3, "Abdallah");
        names2.add(4, "Vlad");
        names2.add(5, "Saeed");
        names2.add(6, "Suzanne");
        names2.add(7, "Hazal");
        names2.add(8, "Yildiz");
        names2.add(9, "Samir");

        System.out.println("The ArrayList = " + names2);
        System.out.println("The size of the ArrayList = " + names2.size());
        /*
        we reached our capacity of 10 memories. we can add more. but needs to allocate more
        memory. Not increase by one but with a formula.
        we can update elements.
        In array we will update the following.
        Update Ali -alex
        Mike
        Andrii
         */
        names1[1]="Mike";
        names2.set(1, "Olena"); // update in ArrayList. the position and name
        // change name from Joe to Olena in arraylist
        System.out.println("The array = " +Arrays.toString(names1));//[Alex, Mike, Andrii]
        System.out.println("The ArrayList = " + names2);//[John, Olena, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]
        System.out.println("The size of the ArrayList = " + names2.size());

//5. Updating an existing element in an array vs ArrayList
        names1[1] = "Mike";
        System.out.println(names2.set(1, "Beyza"));

        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, Mike, Andrii]
        System.out.println("The ArrayList = " + names2); // [John, Olena, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]

    }
}
