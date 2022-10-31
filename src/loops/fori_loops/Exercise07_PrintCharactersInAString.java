package loops.fori_loops;

public class Exercise07_PrintCharactersInAString {
    public static void main(String[] args) {
        /*
 System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(str.length()-1));
         */
        String str = "TechGlobal School";
        for (int i =0; i <=str.length()-1; i++){
            System.out.println(str.charAt(i));
        }
    }
}
