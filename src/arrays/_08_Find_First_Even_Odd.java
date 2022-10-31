package arrays;

public class _08_Find_First_Even_Odd {
    public static void main(String[] args) {
int[] numbers = {0, 5, 3, 2, 4, 7, 10};
printFirstEvenOdd(numbers);

String [] strts={"ABCD", "abcd", "123", "!@#"};
        printStartsWithA(strts);
}
    /*Create a public static method which will take an int array then it will
    print out the first even and first odd number.

            Example:
            - array =  {0, 5, 3, 2, 4, 7, 10};
    Output:
    First even = 0
    First odd = 5

    Example:
            - array =  {0, 2, 2, 5, 3, 2, 4, 7, 10};
    Output:
    First even = 0
    First odd = 5

Pseudo code:
1. containers : one for even, one for odd.
2.loops
3. print
     */
    public static void printFirstEvenOdd(int[] numbers) {
        int fEven = 0, fOdd = 0; // storing
        boolean isEvenFound = false, isOddFound = false; // checking

        for (int n : numbers) {
            if (!isEvenFound && n % 2 == 0) {//if first even not found and the number is even
                fEven = n; // marking flag as true so next time you will know
                isEvenFound= true;
            }else if(!isOddFound && n% 2 ==1){ // if first odd not found and the number is odd
                fOdd = n;
                isOddFound=true;// marking flag as true so next time you will know odd has found
            }
        }
        System.out.println("First even = " + fEven);
        System.out.println("First odd = " + fOdd);
    }
    /*
Create a public static method which will take a String array then it will
print out the first String starting with "a", NOT CASE SENSITIVE
If there is not a String which is starting with "a" print -> 'No String starting with "a"'

Example1:
- array =  {"ABCD", "abcd", "123", "!@#"}

Output1:
    First string with "a" = "ABCD"

Example2:
- array =  {"abcd", "123", "!@#"}

Output2:
    First string with "a" = "abcd"

Example3:
- array =  {"123", "!@#"}

Output3:
    No String starting with "a"

    1.containers-- isAFound
    2.Loop = should start with and should be first
    3.print them - "str" otherwise "no string starting with a"
 */
    public static void printStartsWithA(String [] strts){
        String letterA = "a";
        boolean isAFound= false; // since didnt find A yet, start with false then the bottom will be true

        for (String s:strts) {
            if (s.toLowerCase().startsWith("a") && !isAFound) {
                System.out.println("First string with \"a\" = " + s);
                isAFound=true;
            }
        }
        if(!isAFound){
            System.out.println("No String starting with \"a\"");
        }
        }

}
