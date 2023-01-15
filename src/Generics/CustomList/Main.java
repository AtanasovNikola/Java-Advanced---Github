package Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        CustomList<String> list = new CustomList<>();
        while (!command[0].equals("END")) {

            switch (command[0]) {
                case "Add":
                    String element = command[1];
                    list.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(command[1]);
                    list.remove(index);
                    break;
                case "Contains":
                     element = command[1];
                    System.out.println(list.contains(element));
                    break;
                case "Greater":
                    element = command[1];
                    System.out.println(list.greater(element));
                    break;
                case "Max":
                    list.max();
                    break;
                case "Min":
                   list.min();
                    break;
                case "Print":
                    list.print();
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    list.swap(index1,index2);
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }
    }
}
