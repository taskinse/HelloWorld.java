package arrays;

public class DeclaringAnArray {
    public static void main(String[] args) {
        //Declare an array
        String[] countries;
        int[] numbers;
        char[] characters;
        double[] doubles;
        boolean[] booleans;
        //Initialization ... Assignment with size only.(need to give an idea how many if not will give a error)
        countries = new String[3];
        numbers = new int[5];
        characters = new char[4];
        doubles = new double[4];
        booleans = new boolean[4];

        System.out.println(countries[0]);// null
        System.out.println(numbers[0]); // 0, it is a default for byte,short,long
        System.out.println(characters[0]);// symbol box with a diagnal
        System.out.println(doubles[0]);//0.0
        System.out.println(booleans[0]);//false
    }
}
