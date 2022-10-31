package projects;

import apple.laf.JRSUIConstants;
import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Random;
import java.util.Scanner;

public class prcac {
    public static void main(String[] args) {
        String name = ScannerHelper.getAName();
        String s = "Merve";
        //       01234.. 4
        // starting pt and end pt
        for (int i = s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));

        }
    }
}
