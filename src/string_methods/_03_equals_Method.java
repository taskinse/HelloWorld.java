package string_methods;

import java.sql.SQLOutput;

public class _03_equals_Method {
    public static void main(String[] args) {
        /*
      1.return type(line s1.equals(s2)
      2. returns a boolean
      3.non-static (object name)
      4.it takes one Object as an argument. non-overloaded. when you click on equals....Object anObject.

      CANNOT STORE S1==S2 IT WILL GIVE THE CORRECT RESULT BUT CANNOT USE IT IN STRING.
         */
        String s1="hello";
        String s2="java";
        String s3="Hello";

        boolean b1=s1.equals(s2);
        System.out.println(b1); //false
        System.out.println(s2.equals(s3));//false
        System.out.println(s1.equals(s3));//false because of one is caps and other lowers. different Ascii values.
        System.out.println("abc".equals("abc"));//lenght is not equal thats why this is false
        System.out.println("".equals(""));//true
        System.out.println("".equals(" "));//false because space in the second one.
        System.out.println(s1.equalsIgnoreCase(s3));//true because it will ignore the h and H . the upper/lowercase. which will result same
    }
}
