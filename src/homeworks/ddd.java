package homeworks;

import java.util.Map;
import java.util.TreeMap;

public class ddd {
    public static void main(String[] args) {
        System.out.println(parseData1a("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
    }

    public static Map<Integer, String> parseData1a(String str) {
        String[] arr = str.replaceAll("[{}]", " ").trim().split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            map.put(Integer.parseInt(arr[i]), arr[i + 1]);
            i++;
        }
        return map;
    }
}
