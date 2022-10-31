package casting;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        Int vs Integer will get both 25 for outcome.
        i2 has many methods with Integer. can compare to other integer.
        i1 cannot provide it is a primitive.
        can convert both to each other in value.

        string ex: we have reduntant thats why its highlighting.

         */
        int i1=25;
        System.out.println(i1);

        Integer i2=25;
        System.out.println(i2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(3,5)); // integers have comparable methods like max and min with int cant do it

        String s = "25"; // convert to integer with the help of wrapper integer.
        System.out.println(Integer.valueOf(s) +5 ); // integer is highlating there is a better way.
        System.out.println(Integer.parseInt(s)+5); // intelligie prefers this method same answer





    }
}
