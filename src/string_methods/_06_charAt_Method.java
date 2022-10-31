package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /*
        1. return
        2.returns a char at given index
        3.

        out of 0 to 10, put a - will get out of boundaries.
         */

        String sentence = "Java is fun";
        char c1 = sentence.charAt(3);//'a' gives the character itself, since it gives a char (returns a char)

        char c2 = sentence.charAt(4);//" " space
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9));// u

        // NOTE: runtime error. Java is fun: 11 characters. the last one is 11-1=10;
        System.out.println(sentence.charAt(-5));//runtime error. try to get this. string index out of bounds.
        System.out.println(sentence.charAt(50)); // out of range.
        System.out.println("End of the program");


    }
}
