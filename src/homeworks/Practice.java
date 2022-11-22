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
        String[] word = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        ArrayList<String> task4 = new ArrayList<>();
        for (int i = 0; i < word.length; i++){
            for(int j = i + 1; j < word.length; j++){
                if (word[i].equalsIgnoreCase(word[j]) && !task4.contains(word[i])){
                    task4.add(word[i]);
                }
            }
        }
        if (task4.isEmpty()) System.out.println("There is no duplicates");
        else for (String s : task4) {
            System.out.println(s);
        }

        }
    }






















