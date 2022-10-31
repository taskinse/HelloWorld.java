package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String [][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}
                //3 groups. 3 students in 1st group. 2 in 2nd and 2 in 3rd.
        };
        System.out.println(students[0][1]);//Mehmet. count from left to right. start with counting 0.
        System.out.println(students[1][1]);
        System.out.println(students.length);// 3 .. outside array.
        // print an inner array. student [0]
        System.out.println(Arrays.toString(students[0]));//[Ali, Mehmet, Alex]
        System.out.println(Arrays.toString(students[1]));//[Alex, Regina]
        System.out.println(Arrays.toString(students[2]));//[Abdallah, Newer]
        // print out with loop.
        for (int i = 0; i < students.length ; i++) {
            System.out.println(Arrays.toString(students[i]));
        // better way. printing inner arrays with for each loop
            for(String [] group : students){ // named group.. but could write anything. students need to be the collection.
                System.out.println(Arrays.toString(group));
            }
            // Printing multi-dimensional array.
            System.out.println(Arrays.deepToString(students));//prints it out in one line all. [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]
        } // list it down. Printing each studen with for each loop
        for(String [] group : students){
            for(String student : group){
                System.out.println(student);
            }
        }// Pringing each student with fori loop.
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students [i][j]);

            }
        }
    }
}
