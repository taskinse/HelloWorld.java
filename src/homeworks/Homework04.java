package homeworks;

import utilities.ScannerHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println(" ====== TASK 1 ====== ");

        String name = ScannerHelper.getAName();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(2));
        if (name.startsWith("A")) {
            System.out.println("You are in the club!");
        } else {
            System.out.println("Sorry, you are not in the club");
        }
        System.out.println(" ====== TASK 2 ====== ");
        String address = ScannerHelper.getAnAddress();
        if (address.contains("Chicago")) {
            System.out.println("You are in the club");
        } else if (address.contains("Des Plaines")) {
            System.out.println("You are welcome to join to the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }
        System.out.println(" ====== TASK 3 ====== ");
        String colors = ScannerHelper.getAColor();
        String colors2 = ScannerHelper.getAColor();
        String colors3 = ScannerHelper.getAColor();
        String colors4 = ScannerHelper.getAColor();
        String colorsAll=colors.concat(colors2).concat(colors3).concat(colors4);
        if(colorsAll.toLowerCase().contains("green") && colorsAll.contains("red")){
            System.out.println("Green and red are in the list");
        }
        else if (colorsAll.contains("red")){
            System.out.println("Red is in the list");
        }
        else if (colorsAll.toLowerCase().contains("green")){
            System.out.println("Green is in the list");
        }
        else{
            System.out.println("Green and red are not in the list");
        }
        System.out.println(" ====== TASK 4 ====== ");
        String str = "   Java is FUN   ";
        String str1 = str.trim();
        System.out.println("The first word in the str is = " + str1.toLowerCase().substring(0,4));
        System.out.println("The second word in the str is = " + str1.toLowerCase().substring(5,7));
        System.out.println("The third word in the str is = " + str1.toLowerCase().substring(8,11));
    }
}




