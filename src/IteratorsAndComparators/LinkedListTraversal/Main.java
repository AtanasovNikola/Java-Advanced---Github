package IteratorsAndComparators.LinkedListTraversal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        LinkedList<Integer> list = new LinkedList<>();
        while (commands-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "Add":
                    list.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(command[1]));
                    break;
            }

        }
        for (Object integerLinkedList : list) {
            System.out.print((Integer)integerLinkedList + " ");
        }
    }
}
