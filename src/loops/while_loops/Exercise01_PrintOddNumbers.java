package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {
        /*
        Print odd numbers from 1 to 10(both included) using while loop
        1
        2
        3
        4
        5
        6
        7
        8
        9
        int i =1 (start)
        i<= inside while (termination)

        int i = 1;
        while (i <= 10){
            if (i % 2 == 1) System.out.println(i);
            i++;

            update should not be reallying on a if conditon
GO OVERRRRRR

         */
        int i = 1;
        while (i <= 10){
            if (i % 2 == 1) System.out.println(i);

            i++;
        }
    }
}
