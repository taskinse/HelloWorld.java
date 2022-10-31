package loops.fori_loops;

public class Exercise09_FindSumofNumbers {
    public static void main(String[] args) {

        /*
        Write a Java program to find sum of number from 10 to 15 ( 10 and 15 are included)
Expected output:75
2 end pts: 10 ------ 15
n, n+1, n+2, n+3 etc.
10.11.12.13.14.15.

int age =25;
age +=3 // add  3 to th e age and reassign to the age.

         */
        int sum = 0;

        for (int i = 10; i <= 15; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}