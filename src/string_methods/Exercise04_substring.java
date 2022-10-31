package string_methods;

public class Exercise04_substring {
    public static void main(String[] args) {
       /*
TASK-1
Assume you are given below sentence
"The best is Java"
Write a Java program that extracts "Java" from given sentence
And store extracted value in another String
Finally, print the extracted String

 */

        String s1 = "The best is Java";
        String s2 = s1.substring(12); // other ways to get 12
        System.out.println(s2);

        /*
        Alternatives
        since The best is Java -- 16 character. from 16-4=12 why minus 4(bc Java has 4 characters)
         */
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.substring(s1.indexOf("Java")));
        System.out.println(s1.substring(s1.length()-4));

        /*
        Task 2:
Assume you are given below sentence
 "Java is an object-oriented programming language"
Write a Java program that extracts "Java" and "object-oriented" from given sentence
And store extracted values in separate Strings
Finally, print the extracted Strings

Java- 0,4
object - oriented- 11, 26
str1. comes from the after string.
 */

        String str1 = "Java is an object-oriented programming language";
        String str2= str1.substring(0,4);
        String str3= str1.substring(11,26);
        System.out.println(str2);
        System.out.println(str3);
       /*Alternative
        */

        String java = "Java";
        String oo="object -oriented";
        System.out.println(str1.substring(str1.indexOf(java), java.length()));
        System.out.println(str1.substring(str1.indexOf(oo), str1.indexOf(oo)+oo.length()));

    }
}
