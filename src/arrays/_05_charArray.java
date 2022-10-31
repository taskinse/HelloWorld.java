package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {
        /*
TASK-1
Create a char array and store values below
#
$
5
A
b
H

Print the array

EXPECTED:
[#, $, 5, A, b, H]
 */

        System.out.println("\n-------TASK-1--------\n");
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n-------TASK-2--------\n");
/*
TASK-2
Print the size of the array with a message

EXPECTED:
The size of the array is = 6

will give how many elements in the array.
 */
        System.out.println("Size of the array is = " + characters.length);
        System.out.println("\n-------TASK-3--------\n");
        /*
TASK-3
Print each element using fori loop

EXPECTED:
#
$
5
A
b
H
*/

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);

            System.out.println("\n-------TASK-4--------\n");
            for (char character : characters) {
                System.out.println(character);
/*
for(int element : characters){
System.out.println(element);
 */
                System.out.println("\n-------TASK-5 for each loop--------\n");
                for (char character2 : characters) {
                    if (Character.isLetter(character2))
                    {
                        System.out.println(character2);
                    }
                    System.out.println("\n-------TASK-6 fori loop--------\n");
                    for (int j = 0; j < characters.length; j++) {
                        if(Character.isLetter(characters[j])) System.out.println(characters[j]);
                        System.out.println("\n-------TASK-6 fori loop--------\n");
                        int countUpper =0;
                        for(char character3 : characters){
                            if(Character.isUpperCase(character3)) countUpper++;}
                        System.out.println( "Uppercase = " + countUpper);

                        /*
                        int countU2 =0;
                        for(int i =0; i < characters.length; i++){
                        if(Character.isUppercase(characters[i])) countU2++;
                        }
                        System.out.println(countU2);
                        in order to do more. practice lowercase, specials, digits, space
                         */
                        }
                }
                }
            }
    }
}
