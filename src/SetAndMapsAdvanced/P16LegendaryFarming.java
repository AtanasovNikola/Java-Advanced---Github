package SetAndMapsAdvanced;

import java.util.*;

public class P16LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Shadowmourne – requires 250 Shards
        //•	Valanyr – requires 250 Fragments;
        //•	Dragonwrath – requires 250 Motes
        String[] input = scanner.nextLine().split("\\s+");
        int shadowmourne = 0;
        int valanyr = 0;
        int dragonwrath = 0;
        String winner = "";
        Map<String, Integer> valid = new HashMap<>();
        Map<String, Integer> inValid = new HashMap<>();
        while (true) {
            for (int index = 0; index < input.length; index += 2) {
                int number = Integer.parseInt(input[index]);
                String item = input[index + 1].toLowerCase(Locale.ROOT);
                valid.putIfAbsent("shards", 0);
                valid.putIfAbsent("fragments", 0);
                valid.putIfAbsent("motes", 0);
                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    valid.put(item, valid.get(item) + number);
                } else {
                    inValid.putIfAbsent(item, 0);
                    inValid.put(item, inValid.get(item) + number);
                }
                if (winner(valid)) {
                    for (var entry : valid.entrySet()) {
                        if (entry.getValue() > 249) {
                            switch (entry.getKey()) {
                                case "shards":
                                    winner = "Shadowmourne";
                                    break;
                                case "fragments":
                                    winner = "Valanyr";
                                    break;
                                case "motes":
                                    winner = "Dragonwrath";
                                    break;
                            }
                            valid.replace(entry.getKey(), entry.getValue() - 250);
                        }
                    }
                    System.out.printf("%s obtained!%n", winner);
                    valid
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                            .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
                    inValid
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.<String, Integer>comparingByKey())
                            .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
                }
            }
            input = scanner.nextLine().split("\\s+");
        }
    }



    private static boolean winner(Map<String, Integer> map) {
        for (var entry : map.entrySet()) {
            if (entry.getValue() > 249) {
                return true;
            }
        }
        return false;
    }
}

