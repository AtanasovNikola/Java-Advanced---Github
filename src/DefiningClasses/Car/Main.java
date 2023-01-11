package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCars = Integer.parseInt(scanner.nextLine());
        while (numOfCars-- > 0) {
            String[] inputCar = scanner.nextLine().split("\\s+");
            CarConstructor car;
            String brand = inputCar[0];
            if (inputCar.length == 1) {
                car = new CarConstructor(brand);
                car.setBrand(brand);
            } else {
                String model = inputCar[1];
                int horsePower = Integer.parseInt(inputCar[2]);
                car = new CarConstructor(brand, model, horsePower);
                car.setBrand(brand);
                car.setHorsePower(horsePower);
                car.setModel(model);

            }
            System.out.println(car);
        }
    }
}
