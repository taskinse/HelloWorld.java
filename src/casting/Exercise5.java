package casting;

public class Exercise5 {
    public static void main(String[] args) {
         /* work environment data is not always coming like this it comes as a string.
         need to convert it FIRST. bring the data into format we need to use.
         need actual number switch from text. convert s1 and s2 to int.
         there is boxing. replace with parse.
        Find below:
        sum of s1 and s2
        difference of s1 and s2
        absolute difference of s1 and s2
        product of s1 and s2
        division of s1 and s2
        remainder of s1 and s2
        max and min
         */
        String s1="35", s2="10"; // these are text number values can be done
        int i1=Integer.parseInt(s1);
        int i2=Integer.parseInt(s2);
        System.out.println("Sum of s1 and s2"+ (i1+i2));
        System.out.println("Sum of s1 and s2 = " + (i1 + i2)); // 45
        System.out.println("Difference of s1 and s2 = " + (i1 - i2)); // 25
        System.out.println("Absolute Difference of s1 and s2 = " + Math.abs(i1 - i2)); // 25
        System.out.println("Product of s1 and s2 = " + (i1 * i2)); // 350
        System.out.println("Division of s1 and s2 = " + (i1 / i2)); // 3
        System.out.println("Remainder of s1 and s2 = " + (i1 % i2)); // 5
        System.out.println("Min number of s1 and s2 = " + Math.min(i1, i2)); // 10
        System.out.println("Max number of s1 and s2 = " + Math.max(i1, i2)); // 35


    }
}
