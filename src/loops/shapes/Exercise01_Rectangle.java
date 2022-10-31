package loops.shapes;

public class Exercise01_Rectangle {
    public static void main(String[] args) {
        /*
Write a program to print below rectangle
* * * * * *
*         *
*         *
*         *
*         *
*         *
*         *
* * * * * *
 */
        System.out.println("* * * * * *");//1
        System.out.println("*         *");//2
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");//8

        for (int i = 1; i <= 8; i++) {
            if (i == 1 || i == 8) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }
    }
}
