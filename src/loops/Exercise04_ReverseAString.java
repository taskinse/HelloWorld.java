package loops;

import utilities.ScannerHelper;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
        Reverse the name and print it back
        Alex --- xelA.. the last pt start pt
        name.charAt(namelength()-1)
        when it comes to 0 it needs to come to an stop

        int i =name.length()-1;(starts at the last character) i >=0 (stop)

       +ii // StringIndexOutofBox when you put it.. Alex.. comes out of context i=3;
         */
        String name = ScannerHelper.getAName();
        String reversedName = "";
        for (int i =name.length()-1; i >=0; i--) {
            reversedName+=name.charAt(i);
        }
        System.out.println("The reversed name is = " + reversedName);
        }

    }
