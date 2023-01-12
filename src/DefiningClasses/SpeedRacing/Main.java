package DefiningClasses.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        while (countCars-- > 0) {
            String[] currentCar = scanner.nextLine().split("\\s+");
            String model = currentCar[0];
            int fuelAmount = Integer.parseInt(currentCar[1]);
            double consumption = Double.parseDouble(currentCar[2]);
            Car car = new Car(model, fuelAmount, consumption);
            carMap.put(model, car);
        }
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            String carModel = command[1];
            int km = Integer.parseInt(command[2]);
            if (carMap.get(carModel).hasEnoughFuel(km)) {
                carMap.get(carModel).setFuelAmount(km);
                carMap.get(carModel).setDistance(km);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine().split("\\s+");
        }
      carMap.entrySet().forEach(e-> System.out.println(e.getValue()));
    }
}
