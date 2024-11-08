package Day_13_Polymorphism_1.in.kgcoding;

public class Car extends Vehicle {
    public void start(){
        System.out.println("Starting");
    }

    public int numberOfDoors() {
        return(4);
    }
}
