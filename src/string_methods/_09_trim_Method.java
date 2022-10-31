package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {
        /*
        1.return type
        2. returns a string
        3. non-static call with an object
        4. no arguments. no overload.

         */
        String s1="   Hello  ";
        System.out.println(s1.length());//10
        System.out.println(s1.trim().length()); //5
        System.out.println(s1);

        s1=s1.trim();
        System.out.println(s1);//"Hello"
        System.out.println(s1.length());//5
    }
}
