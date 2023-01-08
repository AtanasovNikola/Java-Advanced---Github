package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (!input.equals("cancel")) {
                queue.offer(input);
            } else {
                String print = queue.isEmpty() ? "Printer is on standby" : "Canceled " + queue.poll();
                System.out.println(print);
            }
            input = scanner.nextLine();
        }
        for (String documentsToPrint : queue) {
            System.out.println(documentsToPrint);
        }
    }
}
