package SetAndMapsAdvanced;

import java.util.*;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> map = new LinkedHashMap<>();
map(input,map);
print(map);
    }

    private static void print(Map<Double, Integer> map) {
        for (var element:map.entrySet()) {
            System.out.printf("%.1f -> %d%n",element.getKey(), element.getValue());
        }
    }

    private static Map<Double, Integer> map(double[] input, Map<Double, Integer> map) {
        for (int index = 0; index < input.length; index++) {
            map.putIfAbsent(input[index], 0);
            map.put(input[index], map.get(input[index]) + 1);
        }
        return map;
    }
}
