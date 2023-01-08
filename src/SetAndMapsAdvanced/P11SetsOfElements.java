package SetAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P11SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] length = scanner.nextLine().split(" ");
        int lengthFirstSet = Integer.parseInt(length[0]);
        int lengthSecondSet = Integer.parseInt(length[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        set(firstSet, lengthFirstSet, scanner);
        set(secondSet, lengthSecondSet, scanner);
        print(firstSet,secondSet);

    }

    public static Set<Integer> set(Set<Integer> set, int length, Scanner scanner) {
        for (int i = 0; i < length; i++) {
        int num = Integer.parseInt(scanner.nextLine());
            set.add(num);
        }
        return set;
    }

    public static void print(Set<Integer> first, Set<Integer> second) {
        for (Integer numbers : first) {
            if (second.contains(numbers)) {
                System.out.print(numbers +" ");
            }
        }
    }
}

