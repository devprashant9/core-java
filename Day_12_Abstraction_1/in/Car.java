package Day_12_Abstraction_1.in;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car(String numberOfTires) {
        super(numberOfTires);
    }

    public void doors(){
        System.out.println(this.numberOfDoor);
    }
}
