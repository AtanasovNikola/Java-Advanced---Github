package SetAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{shop}, {product}, {price}". input
        String[] input = scanner.nextLine().split(", ");
        Map<String, Map<String, Double>> map = new TreeMap<>();


        while (!input[0].equals("Revision")) {
            String shop = input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);
            map.putIfAbsent(shop, new TreeMap<>());
            map.get(shop).put(product, price);
            input = scanner.nextLine().split(", ");
        }

        //"{shop}->
        //Product: {product}, Price: {price}" output
        map.forEach((key, value) -> {
            System.out.printf("%s->%n", key);
            value.forEach((key1, value1) -> System.out.printf("Product: %s, Price: %.1f%n", key1, value1));
        });
    }
}
