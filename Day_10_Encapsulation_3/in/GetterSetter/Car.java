package Day_10_Encapsulation_3.in.GetterSetter;

public class Car {
    private String colour; // but i want public access
    private String model; // but i want public access
    private double fuelLevel;
    private long costOfPurchase; // but i want default access

    public Car(String colour, String model, double fuelLevel, long costOfPurchase) {
        this.colour = colour;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public Car() {

    }

    public String getColour() {
        return (this.colour);
    }

    public void setColour(String colour) {
        if (colour.equals("Pink")) {
            System.out.println("Not Allowed to Set This Colour");
        } else
            this.colour = colour;
    }

    public String getModel() {
        return (this.model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [colour=" + colour + ", model=" + model + ", fuelLevel=" + fuelLevel + ", costOfPurchase="
                + costOfPurchase + "]";
    }

}
