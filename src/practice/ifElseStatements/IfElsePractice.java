package practice.ifElseStatements;

public class IfElsePractice {
    public static void main(String[] args) {
        /*
number between 0-24 print first quarter
number between 25-49 print second quarter
number between50-74 print third quarter
         */
        int myInt = -45;
        if (myInt >= 0 && myInt <= 24) {
            System.out.println("first quarter");
        } else if (myInt >= 25 && myInt <= 49) {
            System.out.println("second quarter");
        } else if (myInt >= 50 && myInt <= 74) {
            System.out.println("third quarter");
        }
       /*
if number between-50-1 print number is in negative part
if number between 0 print number is zero
if number between 1 to 50 print number is in positive
single = (assignment), need double
three conditions
if(myInt <=-1 && myInt>=-50){
}
else if (){
}
else if (){
}
         */
int myInt2 =15;
        if (myInt2 <0 && myInt2 >=-50){
            System.out.println("number is in negative part");
        } else if (myInt2 == 0) {
            System.out.println("number is zero");
        } else if (myInt2 >0 && myInt2 <= 50) {
            System.out.println("number is int positive parts");
            System.out.println("system out of range");
        }
    }
}