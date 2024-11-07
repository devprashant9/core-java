package Day_12_Abstraction_1.in.kgcoding;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car(int numberOfTires) {
        super(numberOfTires); // default constructor is always called by child constructor by default
    }

    @Override
    public void makeStartSound(){
        System.out.println("Vroom . . .");
        System.out.println(numberOfDoor);
    }
}
