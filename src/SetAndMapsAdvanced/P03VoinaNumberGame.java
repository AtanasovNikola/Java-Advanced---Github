package SetAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstDeck = new LinkedHashSet<>();
        Set<Integer> secondDeck = new LinkedHashSet<>();
        int[] firstDeckInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondDeckInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        deck(firstDeck, firstDeckInput);
        deck(secondDeck, secondDeckInput);
        int round = 0;
        while (!firstDeck.isEmpty() || !secondDeck.isEmpty()) {
            round++;
            if (round > 49) {
                break;
            }
            int player1 = number(firstDeck);
            int player2 = number(secondDeck);
            firstDeck.remove(player1);
            secondDeck.remove(player2);
            if (player1 > player2) {
                firstDeck.add(player1);
                firstDeck.add(player2);
            } else if (player2 > player1) {
                secondDeck.add(player1);
                secondDeck.add(player2);
            }
        }
        if (firstDeck.isEmpty()) {
            System.out.println("Second player win!");
        } else if (secondDeck.isEmpty()) {
            System.out.println("First player win!");
        }else{
            int sum1 = sum(firstDeck);
            int sum2 = sum(secondDeck);
           if (sum1>sum2){
               System.out.println("First player win!");
           }else if (sum2>sum1){
               System.out.println("Second player win!");
           }else{
               System.out.println("Draw!");
           }
        }
    }

    public static Set<Integer> deck(Set<Integer> deck, int[] deckInput) {
        for (int card : deckInput) {
            deck.add(card);
        }
        return deck;
    }
    public static int sum (Set<Integer> deck){
        int sum = 0;
        for (Integer num : deck) {
            sum+=num;
        }
        return sum;
    }
    public static int number (Set<Integer> deck){
        for (Integer num : deck) {
            return num;
        }
        return 0;
    }
}
