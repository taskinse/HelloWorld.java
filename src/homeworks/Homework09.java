package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework09 {
    public static void main(String[] args) {
            System.out.println(" ========= TASK-1 ========= ");
            int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
            ArrayList<Integer> task1 = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++){
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j])
                    task1.add(numbers[j]);
                }
            }
            if (task1.size() > 0) System.out.println(task1.get(0));
            else System.out.println("There is no duplicates");

            System.out.println(" ========= TASK-2 ========= ");
            String[] words = {"a", "b", "B", "XYZ", "123"};
            ArrayList<String> task2 = new ArrayList<>();
            for (int k = 0; k < words.length; k++) {
                for (int l = k + 1; l < words.length; l++) {
                    if(words[k].equals(words[l].toLowerCase()))
                        task2.add(words[k]);
                }
            }
            if (task2.isEmpty()) System.out.println("There is no duplicates");
            else System.out.println(task2.get(0));

            System.out.println(" ========= TASK-3 ========= ");
            int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
            ArrayList<Integer> task3 = new ArrayList<>();
            for (int m = 0; m < numbers3.length - 1; m++) {
                for (int n = m + 1; n < numbers3.length; n++) {
                    if (numbers3[m] == numbers3[n] && !task3.contains(numbers3[m])) {
                        task3.add(numbers3[m]);
                    }
                }
            }
            if (task3.isEmpty()) System.out.println("There is no duplicates");
            else for (Integer o : task3) System.out.println(o);

            System.out.println(" ========= TASK-4 ========= ");
            String[] words4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
            ArrayList<String> task4 = new ArrayList<>();
            for (int s = 0; s < words4.length; s++) {
                for (int t = s + 1; t < words4.length; t++) {
                    if (words4[s].equalsIgnoreCase(words4[t]) && !task4.contains(words4[s])) {
                        task4.add(words4[s]);
                    }
                }
            }
            if (task4.isEmpty()) System.out.println("There is no duplicates");
            else for (String s : task4) {
                System.out.println(s);

            System.out.println(" ========= TASK-5 ========= ");
            String[] words5 = {"abc", "foo", "bar"};
            for (int y = words5.length - 1; y >= 0; y--) {
                    System.out.println(words5[y]);
            }

            System.out.println(" ========= TASK-6 ========= ");
            String str = "Java is fun";
            ArrayList<String> task6 = new ArrayList<>(Arrays.asList(str.split(" ")));

            for (String z : task6) {
                StringBuilder sb = new StringBuilder(z);
                sb.reverse();
                System.out.print(sb + " ");
                }
            }
        }
    }


