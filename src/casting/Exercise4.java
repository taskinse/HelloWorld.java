package casting;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        boolean .. true or false.
        true false --> "true", "false" -- becomes a text
         */
        System.out.println(true && false); // false
        System.out.println(String.valueOf(true)+String.valueOf(false)); // two strings and plus
        // in the middle concation right next to each other.
        System.out.println(""+ true+false); // string plus primitive. concanation. truefalse
        System.out.println(String.valueOf('A')+'a');// concatanation
        System.out.println(""+10.5+5);//10.55 (string starts reading from the left side)
    }
}
