package practice.ifElseStatements;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {
        /*
        1st. assign random number
        2nd. print them. if else, ternary ,sout
    (int)(Random number*big impact=small tea
         */

        int myRandomNumber = (int) (Math.random() * 51 + 0);
        System.out.println("My random number is = " + myRandomNumber);
        if (myRandomNumber >= 10 && myRandomNumber <= 25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println((myRandomNumber));
/*
printing from boolean expression
Systems.out.println(x)>=10&myNUmber<=25
1 to 100 numbers. halfs and quarters the numbers.
if one conditions is covering it fully.
it is raining...it is raining outside. umbrella -go outside, otherwise-stay home.
 if it not raining - you are hungry-go to chich k, otherwise, ride a bike.
 ask user. how is is the weather.do you have umbrella. are you hungry.
 */
        int mySecondRandom = (int) (Math.random() * (100) + 1);
        if (mySecondRandom <= 50) ;
        System.out.println(mySecondRandom + " it is in first half");
        if (mySecondRandom <= 25) System.out.println( " 1st quarter");
        else {
            System.out.println(" 2nd quarter");
        }

        System.out.println(mySecondRandom + " is in the 2nd half");
        if (mySecondRandom <=75) {
            System.out.println(" is in the 3rd quarter");
        } else {
            System.out.println( " is in the 4th quarter");
        }



    }


}
