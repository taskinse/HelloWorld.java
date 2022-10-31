package casting;

public class PrimitivesToString {
    public static void main(String[] args) {
        /*
        will check on the positive side --- concatation and addtion
        both sides primitives - will do sum (15 in the ex:)
        empty , num+num2 --- will become 510. one side is string it becomes concatation
        integer becomes a string.
        can you give value of string 23 --- "23"
        string value of 50--- "50"
         */

        int num1=5;
        int num2=10;

        System.out.println(num1+num2); // number = 15
        System.out.println(""+num1+num2); //text (because double quotation, if it will be single will got o char
        System.out.println(' '+num1+num2);// ASCII value is 32+5+10 =47
        System.out.println(""+(num1+num2)); // this becomes the text 15 because of parenthesis
        System.out.println(String.valueOf(num1) +String.valueOf(num2)); //"5" +"10" - makes it concanation

    }
}
