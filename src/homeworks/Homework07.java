package homeworks;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println(" ======== Task-1 ======== ");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println(" ======== Task-2 ======== ");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println(" ======== Task-3 ======== ");
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);
        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);

        System.out.println(" ======== Task-4 ======== ");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println(" ======== Task-5 ======== ");
        ArrayList<String> marvelCharacters = new ArrayList<>();
        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panter");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");
        System.out.println(marvelCharacters);
        System.out.println(marvelCharacters.contains("Wolwerine"));

        // the rest of the questions will not use add method.will use asList.
        System.out.println(" ======== Task-6 ======== ");
        ArrayList<String> avengersCharacters = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Captain America", "Iron Man"));
        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);
        System.out.println(avengersCharacters.contains("Hulk") && avengersCharacters.contains("Iron Man"));

        System.out.println(" ======== Task-7 ======== ");
        ArrayList<Character> storeCharacters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(storeCharacters);
        for (Character c : storeCharacters) {
            System.out.println(c);
        }
        System.out.println(" ======== Task-8 ======== ");
        ArrayList<String> computerParts = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(computerParts);
        Collections.sort(computerParts);
        System.out.println(computerParts);

        int count = 0;
        for (String computer : computerParts) {
            if (computer.contains("M") || computer.contains("m")) count++;
        }
        System.out.println(count);

        int count1 = 0;
        for (String computer : computerParts) {
            if (computer.startsWith("A") || computer.startsWith("a") || computer.startsWith("E") || computer.startsWith("e"))
                count1++;
        }
        System.out.println(count1);

        System.out.println(" ======== Task-9 ======== ");
        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(kitchenObjects);
        int countUpper = 0;
        for (String k : kitchenObjects) {
            if (Character.isUpperCase(k.charAt(0))) countUpper++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        int countLower = 0;
        for (String k : kitchenObjects) {
            if (Character.isLowerCase(k.charAt(0))) countLower++;
        }
        System.out.println("Elements starts with lowercase = " + countLower);
        int countPp = 0;
        for (String k : kitchenObjects) {
            if (k.contains("P") || k.contains("p")) countPp++;
        }
        System.out.println("Elements having P or p= " + countPp);
        int countPpp = 0;
        for (String k : kitchenObjects) {
            if (k.toLowerCase().startsWith("p") || k.toLowerCase().endsWith("p")) countPpp++;
        }
        System.out.println("Elements starting or ending with P or p = " + countPpp);
        System.out.println(" ======== Task-10 ======== ");
        ArrayList<Integer> numbers10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(numbers10);
        int countTask10 = 0;
        for (int number : numbers10) {
            if (number % 10 == 0) countTask10++;
        }
        System.out.println("Elements that can be divided by 10 = " + countTask10);
        int countEven15 = 0;
        for (int number : numbers10) {
            if (number % 2 == 0 && number > 15) countEven15++;
        }
        System.out.println("Elements that are even and greater than 15 = " + countEven15);
        int countOdd20 = 0;
        for (int number : numbers10) {
            if (number % 2 != 0 && number < 20) countOdd20++;
        }
        System.out.println("Elements that are odd and less than 20 = " + countOdd20);
        int countLG = 0;
        for (int number : numbers10) {
            if (number < 15 || number > 50) countLG++;
        }
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLG);
    }
}
