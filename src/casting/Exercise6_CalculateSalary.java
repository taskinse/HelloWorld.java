package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        /*
        1-find min and max salary
        expected output:
        Min salary =4000.5
        max salary =6000.25

        2- Calculate. 10% of the min salary.
         */
        String salary1="5000";
        String salary2="6000.25";
         String salary3="4000.50";
         double d1=Double.parseDouble(salary1);
        double d2=Double.parseDouble(salary2);
        double d3=Double.parseDouble(salary3);
        System.out.println("Min salary = $" + Math.min(d3,Math.min(d1,d2)));
        System.out.println("Max salary = $" + Math.max(d3,Math.max(d1,d2)));

        System.out.println((Math.min(d3, Math.min(d1,d3)))*.10);
    }
}
