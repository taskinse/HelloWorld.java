package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.returns int which is the total count of the characters
        3.non-static
        4.does not take any argument.no overloading.
         */
        String s  = "John";
        System.out.println(s.length()); //4 .. basically how many characters

        int len = s.length();
        System.out.println(len); // 4...both ways work.

        System.out.println("".length());//0
        System.out.println(" ".length());//1
        System.out.println("  ".length());//2 every space is 1 character.


    }
}
