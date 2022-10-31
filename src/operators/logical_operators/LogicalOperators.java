package operators.logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1 = 3 < 5;
        boolean b2 = 5!=5;
        boolean b3 = 2 == 2;

        boolean b4 = b1 || b2 || b3;
        boolean b5 = b1 && b2 && b3;

        System.out.println(b1);
        System.out.println(!b1);

        System.out.println(!b2 && b1 || b3);

        System.out.println(false || false && true || false);
        System.out.println(!!(false || false && true || false));


    }
}
