package DefiningClasses.CarLady;

public class Cat {
    private String catType;
    private String name;
    private double decibels;

    public Cat(String catType, String name, double decibels) {
        this.catType = catType;
        this.name = name;
        this.decibels = decibels;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDecibels() {
        return decibels;
    }

    public void setDecibels(double decibels) {
        this.decibels = decibels;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",this.catType,this.name,this.decibels);
    }
}