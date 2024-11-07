package Day_12_Inheritence_1.in.kgcoding;

import Day_12_Inheritence_1.in.kgcoding.inheritence.Vehicle;

public class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        // model = "BMW"; // accessing from different package. Cannot access
        speed = 159.689; // accessing protected member from different package. It is allowed only if a class is child class
    }

    public void balance() {
        System.out.println("I am Balancing on 2 Tires.");
    }
}
