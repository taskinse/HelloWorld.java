package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from bt 0 to 10 (0 and 10 are included)

Expected output:
0
2
4
6
8
10
            for (int c = 1 ; c<=10; c+=2){
            System.out.println(c); if this 1.. it will print 1,3,5,
            even though its work there is a risk if the number is random.
            for (int c = 0 ; c<=10; c+=2){
            System.out.println(c); not recommended because our start and end point.

         */
        for (int i = 0; i <=10; i++) {
            if(i% 2==0) System.out.println(i); // will print 0,1,2,3,4,... 10
        }
    }
}
