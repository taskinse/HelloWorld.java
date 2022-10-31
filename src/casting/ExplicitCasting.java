package casting;

import java.sql.SQLOutput;

public class ExplicitCasting {
    /*
    Explicit casting - NARROWING - DOWNCASTING.
    this will show you complier error.
    age =25 fit the big container into small container

    take the risk, convert what you will get.
    but, we will lose data if higher primitive holds a data that cannot
    be stored in the small.

    2nd ex: seems ok for the compiler. (5000). cast manually.
    exceed the capacity get a wrong error.// gives a different answer.
     */
    public static void main(String[] args){
    int age = 25;
    byte b = (byte) age;
    System.out.println(b);

    int num1 = 5000;
    byte num2 = (byte) num1; // putting byte infront of the int variable. it seems okay for the compiler.
    System.out.println(num2);
}

}
