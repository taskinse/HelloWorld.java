package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.return boolean
        3.non-static
        4.takes one argument as CharSequence same like String

         */

        String s="TechGlobal School";
        System.out.println(s.contains("Tech"));//true
        System.out.println(s.contains("School"));//true
        System.out.println(s.contains("a"));//true
        System.out.println(s.contains("E"));//false

        //Important
        System.out.println(s.contains(""));//true
        System.out.println(s.contains(s));//true
        System.out.println(s.contains("Education"));//false
    }
}
