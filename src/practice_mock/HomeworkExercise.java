package practice_mock;

public class HomeworkExercise {
    public static void main(String[] args) {
        /*
        project3:#2;
        prime:2,3,5,7,11,13,17,19,23,29,31
        if(prime){
        }else{//num is not prime number}
        tell me your pseudo code: need to explain what you are
        doing.
         */

        int random = (int) ((Math.random() * 35) + 1);
        System.out.println(random);
        if (random == 2 || random == 3 || random == 5 || random == 7) {
            System.out.println("Outcome is prime");
        } else {
            System.out.println("Outcome is non-prime");

        }
    }
}