package DefiningClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engineMap = new LinkedHashMap<>();
        while (numOfEngines-- > 0) {

            String[] currentEngine = scanner.nextLine().split("\\s+");
            String model = currentEngine[0];
            int power = Integer.parseInt(currentEngine[1]);
            Engine engine = null;
            switch (currentEngine.length) {
                case 2:
                    engine = new Engine(model, power);
                    break;
                case 3:
                    if (currentEngine[2].matches("\\d+")) {
                        int displacement = Integer.parseInt(currentEngine[2]);
                        engine = new Engine(model, power, displacement);
                    } else {
                        String efficiency = currentEngine[2];
                        engine = new Engine(model, power, efficiency);
                    }
                    break;
                case 4:
                    int displacement = Integer.parseInt(currentEngine[2]);
                    String efficiency = currentEngine[3];
                    engine = new Engine(model, power, displacement, efficiency);
                    break;
            }
            engineMap.putIfAbsent(model, engine);

        }
        int numOfCars = Integer.parseInt(scanner.nextLine());

        while (numOfCars-- > 0) {

            String[] currentCar = scanner.nextLine().split("\\s+");
            String brand = currentCar[0];
            String model = currentCar[1];
            Car car = null;
            switch (currentCar.length) {
                case 2:
                    car = new Car(brand, engineMap.get(model));
                    break;
                case 3:
                    if (currentCar[2].matches("[A-Za-z]+")) {
                        String color = currentCar[2];
                        car = new Car(brand, engineMap.get(model), color);
                    } else {
                        int weight = Integer.parseInt(currentCar[2]);
                        car = new Car(brand, engineMap.get(model), weight);
                    }
                    break;
                case 4:
                    int weight = Integer.parseInt(currentCar[2]);
                    String color = currentCar[3];
                    car = new Car(brand, engineMap.get(model), weight, color);
                    break;
            }
            System.out.println(brand + ":");
            System.out.print(car);
        }
    }
}
