package SetAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Set<String> set = new LinkedHashSet<>();
        while (!input[0].equals("END")) {
            String direction = input[0];
            String carNumber = input[1];
            if (direction.equals("IN")) {
                set.add(carNumber);
            } else {
                set.remove(carNumber);
            }
            input = scanner.nextLine().split(", ");
        }
        if (set.isEmpty()){
            System.out.println("Parking Lot is Empty");
            return;
        }
        for (String carNumber : set) {
            System.out.println(carNumber);
        }
    }
}
