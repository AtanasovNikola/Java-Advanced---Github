package DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumption;
    private int distance;

    public Car(String model, int fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean hasEnoughFuel(int km) {
        if (fuelAmount - consumption * km > 0) {
            return true;
        }
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int km) {
        this.fuelAmount -= this.consumption * km;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(double km) {
        this.distance += km;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model , this.fuelAmount,this.distance);
    }
}
