package math_class;

public class MinAndMaxMethods {
    public static void main(String[] args) {
        /*
        Math class doesn't need an object for using their methods. Call name and the methods after .
         */
    int maxNumber = Math.max(80,27);
        System.out.println("maxNumber = "+ maxNumber);
    /*
    add another extra number
     */
        int maxNumber2=Math.max(maxNumber, 125);
        System.out.println("maxNumber2 = "+ maxNumber2);

        int maxNumber3= Math.max(maxNumber2, 625);
        System.out.println("maxNumber3 = "+ maxNumber3);

        int minNumber = Math.min(80,27);
        System.out.println("\nminMath = " + minNumber);

        int minNumber2 = Math.min(Math.min(80,27), 2);
        System.out.println("minMath2 =" + minNumber2);

        int minOfTwoNeg = Math.min(-40,-60);
        System.out.println("minofTwoNeg = " + minOfTwoNeg);

        double maxOfTwoDecimals = Math.max(1.7, 6.5);
        System.out.println("maxofTwoDecimals = " +maxOfTwoDecimals);
        double maxOfTwoDecimalNeg = Math.max(-5.4, -27.2);
        System.out.println("maxOfTwoDecimals = " +maxOfTwoDecimalNeg);

        /*
        max value of the given numbers and print them
         */

        int maxValue1 = Math.max(6,9);
        System.out.println("Max is " + maxValue1);
        int maxValue2 = Math.max(17, 49);
        System.out.println("Max is " + maxValue2);
        double maxValue3 = Math.max(34.2, 12.5);
        System.out.println("Max is " + maxValue3);
        int maxValue4 = Math.max(-14, -32);
        System.out.println("Max is " + maxValue4);
        int maxValue5 = Math.max(17, 49);
        int maxValue6 =Math.max(maxValue5, 125);

        /*
        can do hardcore. just write the ask numbers inside.
         */
        System.out.println("Max is " + Math.max(6,9));
        System.out.println("Max is " + Math.max(17,49));
        System.out.println("Max is " + Math.max(34.2,12.5));
        System.out.println("Max is " + Math.max(-14, -32));

        System.out.println("Max is " + Math.max(Math.max(17,49), 125));

        System.out.println("Min is " +Math.min(6,9));
        System.out.println("Min is " +Math.min(17,49));
        System.out.println("Min is " +Math.min(34.2, 12.5));
        System.out.println("Min is " +Math.min(-14, -32));
        System.out.println("Min is " +Math.min(Math.min(17, 49), 125));
        System.out.println("Min is " +Math.min(Math.min(45,32),Math.min(56,89)));



    }
}
