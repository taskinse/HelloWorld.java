package casting;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        print out num1 divide num2. gives us 2.. how to get 2.5? convert
        num1 and num2 double. how to convert?
        convert them to double and then printing. this is also casting.
        before the num add the double. int cant hold decimal thats why
        its 2. 2. things to get 2.5 (store as double, change overall to double.
         */

        int num1=5, num2=2;
        System.out.println(num1/num2);
        System.out.println((double)num1/(double)num2);//
        System.out.println((double)num1/num2);
        System.out.println(num1/(double)num2);
        System.out.println((double)(num1/num2));

    }
}
