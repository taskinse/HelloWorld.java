package math_class;

public class MathRandomMethod {
    public static void main(String[] args){
 /*
 when you multiply by a number can increase the random number. how to get rid of the decimal.
  */
        double myRandom=Math.random();
        int myRandomBetween0to10=(int) (Math.random()*11);
        int myDice = (int)(Math.random()*6) +1;

        int myRandomBetween50to100= (int)(Math.random()*(100-50+1)+50);
        System.out.println("Random number between 50 to 100 is " +myRandomBetween50to100);

        int myRandombetween20to40 = (int)(Math.random()*(21)+20);
        System.out.println("Random number between 20 to 40 is " + myRandombetween20to40);


        System.out.println("Random number is =" + Math.random());
        System.out.println("Random number between 0 to 10 is =" + myRandomBetween0to10);
        System.out.println("My dice value is =" + myDice);
    }
    }
