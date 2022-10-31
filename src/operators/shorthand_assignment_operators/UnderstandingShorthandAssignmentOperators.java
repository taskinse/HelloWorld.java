package operators.shorthand_assignment_operators;

public class UnderstandingShorthandAssignmentOperators {
    public static void main(String[] args) {
        int age =10;
        System.out.println(age);

        /*
        What will be the age 5 years later?
         */

        age +=5;
        System.out.println(age);

        System.out.println("======Task=====2");
        int num1 =50;
        System.out.println(num1 %=12);

        int num2 = 5;
        num2 *=3;
        System.out.println(num2);
    }
}
