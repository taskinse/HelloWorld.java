package loops;

public class Exercise03_FizzBuzz {
    public static void main(String[] args) {
        /* INTERVIEW QUESTIONS:

i % 3 == 0 && i % 5 == 0 instead of this could say 15
         */
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
