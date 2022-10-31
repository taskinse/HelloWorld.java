package practice_mock;

import java.util.Scanner;

public class MockReview {
  public static void main(String[] args) {
    System.out.println("==== task 2===== project3");
    /* loop starts at i or j. loop trigging until condition
    is met. starting at 2.until i becomes random number by 2.
     its considered as scope. int i=2 is starting pt because 0,1 ignoring
     looking for prime. if its divided by to 2- not prime. goes
     up 3, then 4, up to half way pt.
     when you write break; you break out of the loop
     random number is 10.. the loop will go to 2,3,4,5,6,7,8,9
     */
    boolean isPrime = false;
    int random = (int) (Math.random() * 35) + 1;
    for (int i = 2; i <= random / 2; i++) {
      if (random % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) System.out.println(random + "is a prime number");
    else System.out.println(random + " is not a prime number");

    System.out.println("==== task 3 of project 3=====");
    int random1 = (int) (Math.random() * 50) + 1;
    int random2 = (int) (Math.random() * 50) + 1;
    int random3 = (int) (Math.random() * 50) + 1;

    int lowest = Math.min(Math.min(random1, random2), random3);
    int greatest = Math.max(Math.max(random1, random2), random3);
    int middle = 0;
    if (lowest == random1) {
      middle = Math.min(random2, random3);
    } else if (lowest == random2) {
      middle = Math.min(random1, random3);
    } else middle = Math.min(random1, random2);
    System.out.println("Lowest number is " + lowest);
    System.out.println("Middle number is " + middle);
    System.out.println("Greatest number is " + greatest);

    System.out.println("==== TASK 4 PROJECT 4====");
    char c1 = 'a';
    char c2 = 'a';
    char c3 = 'R';
    boolean isLowercase = (c1 >= 'a' && c1 <= 'z');
    boolean isUppercase = (c1 >= 'A' && c1 <= 'Z');
    if (isLowercase || isUppercase) {
      if (isLowercase) System.out.println("The letter is lowercase");
      else System.out.println("The letter is uppercase");
    } else System.out.println("Invalid character detected!!!");
    System.out.println("==== TASK 5 PROJECT 4====");


    }

  }

