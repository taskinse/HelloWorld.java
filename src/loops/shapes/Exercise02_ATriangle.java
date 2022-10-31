package loops.shapes;

public class Exercise02_ATriangle {
    public static void main(String[] args) {
        /*
        Write a program that prints below triangle
A //1
AA
AAA
AAAA
AAAAA
AAAAAA //6
         */
        for (int i = 1; i <= 6; i++) { // row
            for (int j = 1; j <=i ; j++) {
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
