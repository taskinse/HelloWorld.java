package homeworks;

import com.sun.org.apache.bcel.internal.generic.FSUB;
import sun.security.x509.InvalidityDateExtension;
import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String s1= "5";
        int i1=Integer.parseInt(s1);

        String answer="";
        int previousNumber=1;
        int currentNumber=0;
        int nextNumber=1;
        for(int i=0; i<= i1; i++){
            answer+=currentNumber+"-";
            previousNumber=currentNumber;
            currentNumber=nextNumber;
            nextNumber=previousNumber+currentNumber;
        }System.out.println(answer.substring(0,answer.length()-3));
        }
    }






















