package SetAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P12CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (int index = 0; index < input.length(); index++) {
            char currentSymbol = input.charAt(index);
            map.putIfAbsent(currentSymbol, 0);
            map.put(currentSymbol, map.get(currentSymbol) + 1);
        }
        map.entrySet().forEach(e->{
            System.out.printf("%c: %d time/s%n", e.getKey(),e.getValue());
        });
    }
}
