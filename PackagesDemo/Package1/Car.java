package PackagesDemo.Package1;

public class Car {
    public String colour;
    public String model;
    private double fuellevel; //cannot access in other class
    long costOfPurchase;

    public Car(){

    }

    public Car(String colour, String model, double fuellevel, long costOfPurchase){
        this.colour = colour;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car [colour=" + colour + ", model=" + model + ", fuellevel=" + fuellevel + ", costOfPurchase="
                + costOfPurchase + "]";
    }
}
