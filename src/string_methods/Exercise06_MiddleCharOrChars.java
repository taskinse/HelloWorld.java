package string_methods;

import utilities.ScannerHelper;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {
        /*
        middle character, index number
        Oleana ----> e --- 2
        Ali    ---> l --->1
        Suzanne ---> a---3
        John  --->oh ---s.substring(1,3)
        s.substring(s.length()/2-1,s.length()/2+1)
        Abdallah -->al -s.substring(3,5)
        s.substring(s.length()/2-1,s.length()/2+1)
        Yildiz --- ld-- s.substring(2,4)
        s.substring(s.length()/2-1,s.length()/2+1)
        (7-1)/2 always find middle

        total char -1/2
         multiple string -- s.substring(1,3)
        formula: s.charAt(s.length()/2) ---- always will find the middle

        odd
        s.charAt(s.length()/2) ---- always will find the middle
        even
        s.substring(s.length()/2-1,s.length()/2+1)

        example user gives spaces. dont want to count as spaces. get rid of them. length.
         */
        String name = ScannerHelper.getAName();
        if (name.length() % 2 == 0) {
            System.out.println("Middle chars are " + name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
        } else {
            System.out.println("Middle char is " + name.charAt(name.length() / 2));

            }

        }
    }

