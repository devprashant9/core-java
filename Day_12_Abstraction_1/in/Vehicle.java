package Day_12_Abstraction_1.in;

public abstract class Vehicle implements Transport {
    private String numberOfTires;

    public Vehicle(String numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public String getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(String numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void commute() {
        System.out.println("Going");
    }

    @Override
    public void getSetGo() {
        System.out.println("Transport is Going");
    }
}
