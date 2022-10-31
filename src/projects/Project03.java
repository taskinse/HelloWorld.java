package projects;

import java.sql.SQLOutput;

public class Project03 {
    public static void main(String[] args) {

        System.out.println(" ===== TASK 1 ===== ");
        String s1 = "24", s2 = "5";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        double i3 = Double.parseDouble(s1);
        double i4 = Double.parseDouble(s2);

        System.out.println("The sum of " + i1 + " and " + i2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + i1 + " and " + i2 + " = " + (i1 - i2));
        System.out.println("The division of " + i1 + " and " + i2 + " = " + (i3 / i4));
        System.out.println("The multiplication of " + i1 + " and " + i2 + " = " + (i1 * i2));
        System.out.println("The remainder of " + i1 + " and " + i2 + " = " + (i1 % i2));

        System.out.println(" ===== TASK 2 ===== ");
        int randomBetween1to35 = (int) (Math.random() * (35) + 1);
        System.out.println(randomBetween1to35);
        if (randomBetween1to35 == 1) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 3) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 5) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 7) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 11) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 13) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 17) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 19) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 23) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 29) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (randomBetween1to35 == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

        System.out.println(" ===== TASK 3 ===== ");
        int random1 = (int) (Math.random() * (50) + 1);
        int random2 = (int) (Math.random() * (50) + 1);
        int random3 = (int) (Math.random() * (50) + 1);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        int max = Math.max(Math.max(random1, random2), random3);
        int min = Math.min(Math.min(random1, random2), random3);
        int middle = (random1 + random2 + random3) - (Math.max(Math.max(random1, random2), random3)) - (Math.min(Math.min(random1, random2), random3));
        if (min == min) {
            System.out.println("Lowest number is = " + min);
            System.out.println("Middle number is =" + middle);
            System.out.println("Greatest number is = " + max);
        }
        System.out.println(" ===== TASK 4 ===== ");
        char num = '5';
        if (num >= 'a' && num <= 'z') {
            System.out.println("Valid character detected");
        } else if (num >= 10) {
            System.out.println("Invalid character detected!!!");
        }
        char cha = 'a';
        if (cha >= 'a' && cha <= 'z') {
            System.out.println("The letter is lowercase");
        } else if (cha >= 'A' && cha <= 'Z') {
            System.out.println("The letter is uppercase");
        }
        char ch = 'R';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The letter is uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The letter is lowercase");
        }

        System.out.println(" ===== TASK 5 ===== ");
        char c='#';
        if (c >= 'A' && ch <= 'Z') {
            System.out.println("The characters is a letter");
        } else {
            System.out.println("invalid character detected!!!");
        }
        char cc='e';
        if (c >= 'a' && ch <= 'z') {
            System.out.println("The letter is vowel");
        }
        else if (cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u'){
            System.out.println("The letter is vowel");
        }
        char ccc='R';
        if (ccc >= 'A' && ccc <= 'Z') {
            System.out.println("The letter is consonant");
        }
        else if (ccc != 'A' || ccc != 'E' || ccc != 'I' || ccc != 'O' || ccc != 'U'){
            System.out.println("The letter is vowel");
        }

        System.out.println(" ===== TASK 6 ===== ");
        char cccc='8';
        if (cccc >= 'A' && cccc <= 'Z') {
            System.out.println("The character is letter");
        }
        else {
            System.out.println("Invalid character detected!!!");
        }
        char cd='*';
        if (cd >= 'A' && cd <= 'Z') {
            System.out.println("The character is letter");
        }
        else {
            System.out.println("Special character is =*");
        }
        System.out.println(" ===== TASK 7 ===== ");
        char character = 'g';
        if (character >= 'a' && character <= 'z') {
            System.out.println("Character is a letter");
        } else {
            System.out.println("Character is not a letter");
        }
        char number = '5';
        if (number >= 'a' && number <= 'z') {
            System.out.println("The character is a letter");
        } else {
            System.out.println("Character is a digit");
        }
        char at = '@';
        if (at >= 'A' && at <= 'Z') {
            System.out.println("The character is a letter");
        } else {
            System.out.println("Character is a special character");

        }
    }

}
