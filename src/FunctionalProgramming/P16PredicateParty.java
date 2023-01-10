package FunctionalProgramming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class P16PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> people = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Party!")) {
            String criteria = command[1];
            Predicate<String> predicate = getPredicate(command);
            switch (command[0]) {
                case "Remove":
                    people.removeIf(predicate);
                    break;
                case "Double":
                    List<String> peopleToAdd = new ArrayList<>();
                    people.stream().filter(predicate).forEach(e -> peopleToAdd.add(e));
                    people.addAll(peopleToAdd);
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }

        if (people.size() != 0) {
            Collections.sort(people);
            System.out.println(String.join(", ",people) + " are going to the party!");
        } else {
            System.out.print("Nobody is going to the party!");
        }

    }

    public static Predicate<String> getPredicate(String[] command) {
        Predicate<String> predicate;
        switch (command[1]) {
            case "StartsWith":
                predicate = name -> name.startsWith(command[2]);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(command[2]);
                break;
            default:
                predicate = name -> name.length() == Integer.parseInt(command[2]);
                break;
        }
        return predicate;
    }
}
