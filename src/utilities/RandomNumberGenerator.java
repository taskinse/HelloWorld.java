package utilities;

public class RandomNumberGenerator {
    /*
    create a method that generates a random number between 2 numbers. (both numbers are included)
    4-6 -->4,5,6
     */
    public static int getARandomNumber(int i1, int i2){
        return (int)(Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);
    }
}
