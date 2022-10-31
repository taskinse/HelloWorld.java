package casting;

public class CastingChars {
    public static void main(String[] args) {
    /*
    gives error. need to do explicit casting.char c1=i1;
    */
        int i1=65;
        System.out.println(i1);
        char c1=(char)i1; // gives A from the Ascii table.
        System.out.println(c1); // gives A from the Ascii table
        System.out.println(51);// this is normal 51
        System.out.println((char)51); // will give digit 3 from ascii
        System.out.println((char)123);// { outcome
        System.out.println((char)32);// space
        System.out.println((char)3100);// some character
        char char1='A';
        char char2=97;// 'a' (saying its equal to a)
        System.out.println(char1 + char2);// 65+97 =162 . sum of the ascii table
        System.out.println("" +char1+char2);//Aa. will start from string. concatenation
        System.out.println(""+ (char1+char2));//priority to the paranthesis

        System.out.println((char1+char2) + "");
        System.out.println(char1 + "" + char2);//string plus any primitive. plus between string.
        /*
        decimal representation + between aritmetic or concantatoin.
        this happens between. complier aritmetic + gives 162. (above example)
        Ascii number results comes out. upcasting.
         */
        char c='A';
        int i= c;
        System.out.println(i);

        /*
        compiler error. will come in downcasting.
        int to char. char cc = n; this will give error need to add (char)
        resolve by explicitly casting.
         */
        int n=97;
        char cc= (char)n;
        System.out.println(cc);


    }
}
