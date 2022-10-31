package casting;

public class ImplicitCasting {
    public static void main(String[] args) {
        /*
        byte can hold -128 to 127
        int can hold more than byte
        implicit casting known as WIDENING or UPCASTING
        small one into big one.
        enlarging the small into bigger. ex: 127 max in,
        bring it one more. making more space.

        ex: different use of terminology
        what are the functions/ methods meaning. (main)
         */

        byte b =127;
        int i = b;
        System.out.println(i);

        float f =10.5F;
        double d=f;
        System.out.println(d);





    }
}
