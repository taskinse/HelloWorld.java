package collections;

import java.util.*;

public class Practice07_ProductPrices {
    /*
  iPhone      -> 1000
  Macbook Pro -> 1300
  iMac        -> 1500
  Airpods     -> 200
  iPad        -> 700

  TASK 1:
  Find the most expensive product and print it as below

  Expected:
  iMac is the most expensive with the price of $1500
   */
    public static void main(String[] args) {
        HashMap<String, Double> product = new HashMap<>();
        product.put("iphone", 1000.00);
        product.put("Macbook Pro", 1300.00);
        product.put("iMac", 1500.00);
        product.put("Airpods", 200.00);
        product.put("ipad", 700.00);

        System.out.println(product);
        double maxPrice = new TreeSet<>(product.values()).last();
        for (Map.Entry<String, Double> entry : product.entrySet()) {
            if (entry.getValue() == maxPrice) {
                System.out.println(entry.getKey() + " is the most cheapest with the price of $" + entry.getValue());
                break;
            }
        }
    }
}
