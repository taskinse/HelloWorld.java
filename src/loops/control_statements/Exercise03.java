package loops.control_statements;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Print all even numbers from 1 to 50 included.
        2,4,6,8... 50

          for (int i = 1; i <=50 ; i++) {
            if(i %2 ==0) System.out.println(i);
         */
        for (int i = 1; i <=50 ; i++) {
            if(i %2 ==1) continue; // because of continue odd numbers it is making it skip, but not preferred method.
            System.out.println(i);
        }
    }
}
