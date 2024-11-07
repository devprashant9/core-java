package Day_12_Inheritence_1.in.kgcoding.inheritence;

public class Vehicle {
    public int numberOfTires;
    private double vehiclePrice; // cannot be accessd by child class
    String model;
    protected double speed;

    public void commute(){
        System.out.printf("I am Going From A to B Using %d Tires. \n", numberOfTires);
    }

    public void setVehiclePrice(double vehiclePrice) { //setter method to be accessd by child class
        this.vehiclePrice = vehiclePrice;
        System.out.println(this.vehiclePrice);
    }
}
