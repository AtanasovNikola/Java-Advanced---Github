package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCars = Integer.parseInt(scanner.nextLine());
        while (numOfCars-->0){
        String [] inputCar = scanner.nextLine().split("\\s+");
        String brand = inputCar[0];
        String model = inputCar[1];
        int horsePower = Integer.parseInt(inputCar[2]);
        Car car = new Car(brand,model,horsePower);
        car.setBrand(brand);
        car.setModel(model);
        car.setHorsePower(horsePower);
            System.out.println(car);
        }
    }
}
