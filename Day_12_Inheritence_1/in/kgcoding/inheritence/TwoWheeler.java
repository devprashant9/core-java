package Day_12_Inheritence_1.in.kgcoding.inheritence;

public class TwoWheeler extends Vehicle {

    public TwoWheeler() {
        numberOfTires = 2; // public data member accessible
        setVehiclePrice(2500000.689); // accesing parent's private data member using setter method
        model = "BMW"; //accessing default member from same package
        speed = 159.968; // accessing protected member from same package
    }

    public void balance() {
        System.out.println("I am Balancing on 2 Tires.");
    }

}
