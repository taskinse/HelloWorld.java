package loops.fori_loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and count how many l letter exist in the name.
        Lioenel --> 2
        Leo -->1
        Lucy --> 1
        the same below two:
        name.charAt(i) =='l' || name.charAt(i)== 'L')countL++;
        name.toLowerCase().chartAt(i) == 'l'
         */
        String name = ScannerHelper.getAName();
        int countL =0;
        for (int i = 0; i <=name.length()-1; i++) {
            if(name.charAt(i) == 'l' || name.charAt(i)== 'L')countL++;
        }
        System.out.println(countL);
    }
}
