package DefiningClasses;

public class CarConstructor {
    private String brand;
    private String model;
    private int horsePower;

    public CarConstructor(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;

    }

    public CarConstructor(String brand, String model, int horsePower) {
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    Override toString;
    public String toString(){
        return String.format("The car is: %s %s - %d HP.",this.brand,this.model,this.horsePower);
    }
}
