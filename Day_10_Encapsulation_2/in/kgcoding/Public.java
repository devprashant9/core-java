package Day_10_Encapsulation_2.in.kgcoding;

public class Public {

    public String carColour;
    public String modelNumber;
    private double fuelLevel; // only be accessed inside this class
    private long costOfPurchase; // only be accessed inside this class

    public Public(String carColour, String modelNumber, double fuelLevel, long costOfPurchase) {
        this.carColour = carColour;
        this.modelNumber = modelNumber;
        this.fuelLevel = fuelLevel; // accessed here
        this.costOfPurchase = costOfPurchase; // accessed here
    }

    public Public() {

    }

    @Override
    public String toString() {
        return "Public [carColour=" + carColour + ", modelNumber=" + modelNumber + ", fuelLevel=" + fuelLevel
                + ", costOfPurchase=" + costOfPurchase + "]";
    }

    

    
}