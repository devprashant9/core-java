package Day_12_Abstraction_1.in.kgcoding;

public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(12); // Error: Can't be instantiated. Only be Extended
        Car car = new Car(4);
        car.commute(); // parents non-abstract method
        car.makeStartSound(); // parents abstract method
    } 
}
