package DefiningClasses.CarSalesman;

public class Car {
    String brand;
    Engine engine;
    int weight;
    String color;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String brand, Engine engine, int weight) {
        this(brand, engine);
        this.weight = weight;
    }

    public Car(String brand, Engine engine, String color) {
        this(brand, engine);
        this.color = color;
    }

    public Car(String brand, Engine engine, int weight, String color) {
        this(brand, engine, weight);
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (getWeight() != 0 && this.getEngine().getDisplacement() != 0) {
            return String.format("%s:%nPower: %d%nDisplacement: %d%nEfficiency: %s%nWeight: %d%nColor: %s%n"
                    , this.getEngine().getModel(), this.getEngine().getPower(),
                    this.getEngine().getDisplacement(), this.getEngine().getEfficiency(),
                    this.getWeight(), this.getColor());
        } else if (getWeight() != 0 && this.getEngine().getDisplacement() == 0) {
            return String.format("%s:%nPower: %d%nDisplacement: n/a%nEfficiency: %s%nWeight: %d%nColor: %s%n"
                    , this.getEngine().getModel(), this.getEngine().getPower(),
                    this.getEngine().getEfficiency(),
                    this.getWeight(), this.getColor());
        } else if (getWeight() == 0 && this.getEngine().getDisplacement() != 0) {
            return String.format("%s:%nPower: %d%nDisplacement: %d%nEfficiency: %s%nWeight: n/a%nColor: %s%n"
                    , this.getEngine().getModel(), this.getEngine().getPower(),
                    this.getEngine().getDisplacement(), this.getEngine().getEfficiency(), this.getColor());
        } else {
return String.format("%s:%nPower: %d%nDisplacement: n/a%nEfficiency: %s%nWeight: n/a%nColor: %s%n"
        , this.getEngine().getModel(), this.getEngine().getPower(), this.getEngine().getEfficiency(),
         this.getColor());
        }
    }
}
