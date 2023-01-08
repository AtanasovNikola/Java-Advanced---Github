package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P16PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // number of plants
        int numOfPlants = Integer.parseInt(scanner.nextLine());
        long[] positionAndAmountOfPesticides = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToLong(Long::parseLong).toArray();

        ArrayDeque<Long> currentPlants = new ArrayDeque<>();
        ArrayDeque<Long> lastPlants = new ArrayDeque<>();
        int days = 0;
        for (long positionAndAmountOfPesticide : positionAndAmountOfPesticides) {
            currentPlants.push(positionAndAmountOfPesticide);
        }
        while (true) {
            boolean isDead = false;
            while (!lastPlants.isEmpty()) {
                long addedPlant = lastPlants.poll();
                currentPlants.push(addedPlant);
            }
            for (int plants = 1; plants < currentPlants.size(); plants++) {
                long lastPlant = currentPlants.pop();
                long leftPlant = currentPlants.peek();
                if (lastPlant <= leftPlant) {

                    lastPlants.push(lastPlant);
                    plants--;
                } else {
                    isDead = true;
                    plants--;
                }
            }
            while (!currentPlants.isEmpty()) {
                currentPlants.pop();
            }
            if (!isDead) {
                break;
            }
            days++;
        }
        System.out.println(days);
    }
}
