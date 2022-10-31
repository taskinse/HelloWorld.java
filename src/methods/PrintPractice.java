package methods;

import utilities.PrintUtils;

public class PrintPractice {
    public static void main(String[] args) {
        /*
        cant see it . method is static call with class name.
        not static - these are the methods envoked with their className.
        Math.min(), Math.max() --- static method

         */
        PrintUtils myPrinter= new PrintUtils();
        myPrinter.printHello();

        PrintUtils.printName("Seyma");
        PrintUtils.printName("Ayla");
        PrintUtils.printName("Almila");

    }
}
