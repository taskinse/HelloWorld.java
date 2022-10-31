package loops.fori_loops;

import java.sql.SQLOutput;

public class UnderstandingForILoop {
    public static void main(String[] args) {
        /*
        Synthax:
        for (initialization; termination condition; change){
        // code block to be executed
          // if you want 100 times
        for (int c = 0; c <= 99; c++) { // 0,1,2...99 since it starts with 0
            System.out.println("Hello World!");
        }
            System.out.println("End of the program");
        }
       can use all primitives except boolean. but will use int.
        for (int i = 0; i <7; i++) { // 0,1,2,3,4,5,6 (total of 7)
        what will happen -- ; it will never stop.
        for (int i = 0; i <7; i--) i is going to negative, its called infinite loop,that never stops.

         */

        for (int i = 0; i <= 10; i++) { // 0,1,2..9 since it starts with 0
            System.out.println("Hello World!");
        }
        System.out.println("End of the program");
    }
}
