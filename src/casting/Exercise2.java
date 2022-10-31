package casting;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        'A' + 'b' plus two primitives. decimall value in ascii.65+98=163
        +20 add to 163 =183
        183 + Hello concanation becomes a string now.
        183 Hello21 (the rest will be concanation as a string. end result STRING
        2nd option: operative start with paranthesis.183 Hello3
        'A' + 'b' + 20 + " Hello +3 ----
         */
        System.out.println('A' + 'b' + 20 + " Hello" +2 +1);// concanation, concanation
        System.out.println('A' + 'b' + 20 + " Hello" +(2 +1));// aritmetic, concanation
    }
}
