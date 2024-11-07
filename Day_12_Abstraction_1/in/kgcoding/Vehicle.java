package Day_12_Abstraction_1.in.kgcoding;

public abstract class Vehicle {
    private int numberOfTires;

    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void commute() {
        System.out.println("Going");
    }

    public abstract void makeStartSound(); //abstract method
}
