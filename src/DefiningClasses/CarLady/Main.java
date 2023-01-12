package DefiningClasses.CarLady;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] currentCat = scanner.nextLine().split("\\s+");
        Map<String, Cat> map = new LinkedHashMap<>();
        while (!currentCat[0].equals("End")) {

            String catType = currentCat[0];
            String name = currentCat[1];
            double decibels = Double.parseDouble(currentCat[2]);

            Cat cat = new Cat(catType, name, decibels);
            map.putIfAbsent(name, cat);


            currentCat = scanner.nextLine().split("\\s+");
        }
        String print = scanner.nextLine();
        System.out.println(map.get(print));
    }
}
