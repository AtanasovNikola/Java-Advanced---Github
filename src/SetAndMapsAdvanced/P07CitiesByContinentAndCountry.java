package SetAndMapsAdvanced;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();
        for (int i = 0; i < iterations; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continents = input[0];
            String countries = input[1];
            String cities = input[2];
            map.putIfAbsent(continents, new LinkedHashMap<>());
            map.get(continents).putIfAbsent(countries, new ArrayList<>());
            map.get(continents).get(countries).add(cities);

        }
        map.forEach((key, value) -> {
            System.out.printf("%s:%n", key);
            value.forEach((key1, value1) -> System.out.printf("  %s -> %s%n", key1,String.join(", " , value1)));



        });
    }
}
