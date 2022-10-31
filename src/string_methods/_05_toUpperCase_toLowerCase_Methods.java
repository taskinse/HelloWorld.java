package string_methods;

public class _05_toUpperCase_toLowerCase_Methods {
    public static void main(String[] args) {
        /*
        1.return type , takes one string and converts and returns it back.
        2.returns a String
        3.Static, call with an Object
        4.the one we use does nto take any argument-there are overloaded methods
         */
        String name="John";
        System.out.println(name.toLowerCase());//john
        System.out.println(name.toUpperCase());//JOHN

        System.out.println("hello".toUpperCase());//HELLO
        System.out.println("HELLO".toLowerCase());//hello

        System.out.println("abc".toUpperCase().toLowerCase());//abc
        System.out.println("ab".toUpperCase().concat("xY".toLowerCase().toLowerCase()));//ABxy

    }
}
