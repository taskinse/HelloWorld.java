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

        System.out.println(" ======== Task-6 ======== ");
        ArrayList<String> avengersCharacters = new ArrayList<>();
        avengersCharacters.add("Hulk");
        avengersCharacters.add("Black Widow");
        avengersCharacters.add("Captain America");
        avengersCharacters.add("Iron Man");
        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);
        System.out.println(avengersCharacters.contains("Hulk") && avengersCharacters.contains("Iron Man"));

        System.out.println(" ======== Task-7 ======== ");
        ArrayList<String> storeCharacters = new ArrayList<>();
        storeCharacters.add("A");
        storeCharacters.add("x");
        storeCharacters.add("$");
        storeCharacters.add("9");
        storeCharacters.add("*");
        storeCharacters.add("+");
        storeCharacters.add("F");
        storeCharacters.add("G");
        System.out.println(storeCharacters);
        for (String c : storeCharacters) {
            System.out.println(c);

            System.out.println(" ======== Task-8 ======== ");
            ArrayList<String> computerParts = new ArrayList<>();
            computerParts.add("Desk");
            computerParts.add("Laptop");
            computerParts.add("Mouse");
            computerParts.add("Moniter");
            computerParts.add("Mouse-Pad");
            computerParts.add("Adapter");
            System.out.println(computerParts);
            Collections.sort(computerParts);
            System.out.println(computerParts);

            int count = 0;
            for (String computer : computerParts) {
                if (computer.contains("M") || computer.contains("m")) count++;
            }
            System.out.println(count);
        }
        System.out.println(" ======== Task-9 ======== ");
        ArrayList<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");
        System.out.println(kitchenObjects);
        int countUpper=0;
        for (String k :kitchenObjects) {

        }
        int countPp = 0;
        for (String k : kitchenObjects) {
            if (k.contains("P") || k.contains("p")) countPp++;
        }
        System.out.println("Elements having P or p = " + countPp);
        int countPpp = 0;
        for (String k : kitchenObjects) {
            if (k.startsWith("P") || k.startsWith("p")) countPpp++;
        }
        System.out.println("Elements starting or ending with P or p = " + countPpp );
        System.out.println(" ======== Task-10 ======== ");
        ArrayList<Integer> numbers10 = new ArrayList<>();
        numbers10.add(3);
        numbers10.add(5);
        numbers10.add(7);
        numbers10.add(10);
        numbers10.add(0);
        numbers10.add(20);
        numbers10.add(17);
        numbers10.add(10);
        numbers10.add(23);
        numbers10.add(56);
        numbers10.add(78);
        System.out.println(numbers10);
        int countTask10=0;
        for (int number: numbers10) {
           if(number % 10 == 0) countTask10++;
        }
        System.out.println("Elements that can be divided by 10 " + countTask10);
        }

}

