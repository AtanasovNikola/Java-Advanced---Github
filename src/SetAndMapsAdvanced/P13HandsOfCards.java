package SetAndMapsAdvanced;

import java.util.*;

public class P13HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(": ");
        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        while (!input[0].equals("JOKER")) {
            String name = input[0];
            String[] cards = input[1].split(", ");
            map(players, name, cards);
            input = scanner.nextLine().split(": ");
        }
        for (var player : players.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());
            System.out.printf("%s: %d%n", name, points);
        }
    }

    private static int calculatePoints(HashSet<String> cards) {

        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String color = card.substring(card.length() - 1);
            int cardPoints = getPower(power) * getColor(color);
            points += cardPoints;
        }
        return points;
    }

    private static int getColor(String color) {
        switch (color) {
            //S, H, D, C
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 0;
    }

    private static int getPower(String power) {
        switch (power) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power);
        }

    }

    private static Map<String, HashSet<String>> map(Map<String, HashSet<String>> map, String name, String[] cards) {
        map.putIfAbsent(name, new HashSet<>());
        for (String card : cards) {
            map.get(name).add(card);
        }
        return map;
    }

}
