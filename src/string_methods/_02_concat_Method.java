package string_methods;

public class _02_concat_Method {
    public static void main(String[] args) {

        /*
        1.Return- (result into another variable line String str3=str1.concat(str2)
        2.Returns a String
        3.Non-static if it was static it will be String.concat but gives error. Needed to create an object for string.
        String str 1= , String str2= etc.
        4.Takes one argument as String
         */
        String str1="Tech";
        String str2="Global";

        String str3=str1.concat(str2);
        System.out.println(str3); //TechGlobal
    }
}
