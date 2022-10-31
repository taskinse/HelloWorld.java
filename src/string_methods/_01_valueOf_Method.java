package string_methods;

public class _01_valueOf_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns a String
        3. static call from class name
        4.takes an argument / there are overload ones. one or more.
         */
        int num=125;
        String numString=String.valueOf(num);
        System.out.println(num+5); // 125+5 =130
        System.out.println(numString+5); // 125+5 = 1255 string

    }
}
