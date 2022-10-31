package string_methods;

public class _04_equalsIgnoreCase_Method {
    public static void main(String[] args) {
        /*
        1.return type
        2.returns a boolean (true or false return)
        3.non-static
        4.it takes one String as argument. it is not over-loaded
         */
        System.out.println("hello".equals("Hello"));//false
        System.out.println("hello".equalsIgnoreCase("Hello"));//true

    }
}
