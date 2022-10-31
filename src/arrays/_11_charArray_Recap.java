package arrays;

import java.util.Arrays;

public class _11_charArray_Recap {
    public static void main(String[] args) {
        // create a char which will hold your name's letter with both ways..
        char [] initial = new char[5];
        initial[0]='S';
        initial[1]='a';
        initial[2]='l';
        initial[3]='i';
        initial[4]='h';
        System.out.println(Arrays.toString(initial));
        char [] initial2 = { 'S', 'a', 'l', 'i', 'h'};
        char [] initial3 = { 'S', 'e', 'y', 'm', 'a'};
        System.out.println(Arrays.toString(initial2));
        initial[0]='a';
        initial[0]=initial[4];
        initial[2]=initial[4];
        System.out.println(Arrays.toString(initial));

        char [] names = new char[5];
        names[0]='S';
        names[1]='e';
        names[2]='y';
        names[3]='m';
        names[4]='a';
        System.out.print(Arrays.toString(names));
        System.out.println("\n for each loop print");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for(char in : initial3){
            System.out.print(in);
        }
        System.out.println("\n fori loop print");
        for (int i = 0; i < initial3.length; i++) {
            System.out.println(initial3[i]);
            
        }

    }
}
