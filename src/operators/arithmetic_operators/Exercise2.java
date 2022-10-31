package operators.arithmetic_operators;

public class Exercise2 {
    public static void main(String[] args) {
        int shortSide = 4;
        int longSide = 7;
        int Area= shortSide * longSide;
        int Perimeter = 2*(shortSide + longSide);

        System.out.println("Area is = " + shortSide * longSide);
        System.out.println("Perimeter is = " + 2 * (shortSide +longSide));

        double yearlyDoubleSalary = 90000;
        int monthly =12;
        int weekly = 52;
        int biWeekly = 26;




        System.out.println("Monthly: " + yearlyDoubleSalary / monthly);
        System.out.println("Bi-weekly: " + yearlyDoubleSalary / biWeekly);
        System.out.println("Weekly: " + yearlyDoubleSalary / weekly);

    }
}
