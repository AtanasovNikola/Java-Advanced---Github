package DefiningClasses.RawData;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        while (cars-- > 0) {

            String[] currentCar = scanner.nextLine().split("\\s+");
            String model = currentCar[0];

            int engineSpeed = Integer.parseInt(currentCar[1]);
            int enginePower = Integer.parseInt(currentCar[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(currentCar[3]);
            String cargoType = currentCar[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tireList = new ArrayList<>();
            for (int currentTire = 5; currentTire < currentCar.length; currentTire += 2) {
                double tirePressure = Double.parseDouble(currentCar[currentTire]);
                int tireAge = Integer.parseInt(currentCar[currentTire + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tireList.add(tire);
            }
            Car car = new Car(model, engine, cargo, tireList);
            carMap.put(model, car);
        }

        String command = scanner.nextLine();
        if (command.equals("fragile")) {
//print all cars whose Cargo Type is "fragile" with a tire whose pressure is  < 1
           carMap.entrySet().stream()
                    .filter(entry -> entry.getValue().getCargo().getCargoType().equals("fragile"))
                   .filter(entry-> entry.getValue().getTireList().stream().anyMatch(tire -> tire.getTyrePressure()<1))
                   .forEach(entry-> System.out.println(entry.getKey()));
        } else {
//print all cars whose Cargo Type is "flamable" and have Engine Power > 250
            carMap.entrySet().stream()
                    .filter(car-> car.getValue().getCargo().getCargoType().equals("flamable"))
                    .filter(car-> car.getValue().getEngine().getEnginePower()>250)
                    .forEach(car-> System.out.println(car.getKey()));
        }
    }
}
