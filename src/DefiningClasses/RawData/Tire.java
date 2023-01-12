package DefiningClasses.RawData;

public class Tire {
    double tyrePressure;
    int ageTyre;

    public Tire(double tyre, int ageTyre) {
        this.tyrePressure = tyre;
        this.ageTyre = ageTyre;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }

    public void setTyrePressure(double tyre) {
        this.tyrePressure = tyre;
    }

    public int getAgeTyre() {
        return ageTyre;
    }

    public void setAgeTyre(int ageTyre) {
        this.ageTyre = ageTyre;
    }
}
