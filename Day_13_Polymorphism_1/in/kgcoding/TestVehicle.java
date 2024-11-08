package Day_13_Polymorphism_1.in.kgcoding;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();
        Car obj2 = new Car();

        Vehicle obj3 = new Car(); //reference of parent and object of child. IS-A Relationship. Car(Child) is a Vehicle(Parent)

        // Car obj4 = new Vehicle(); //Error. Vehicle(Child) is a Car(Parent). Vehicle can be anything not necessary to always be car

        Vehicle obj4 = new Plane();

        // Explicit Casting
        // Car obj5 = (Car) new Vehicle(); //Allows but gives error while compiling

        // Object is Parent Class by Default
        Object obj5 = new Vehicle();
        Object obj6 = new Car();
        Object obj7 = new Plane();


        // by using method to cast explicit

        castTest(obj1);
        castTest(obj2);

    }

    private static void castTest(Vehicle obj){
        obj.start();
        // obj.numberOfDoors(); not allowed before downcasting
        Car obj8 = (Car) obj; // here casting is allowed but NOT Recommended and Unsafe
        obj8.start();
        obj8.numberOfDoors(); // allowed aster downcasting
        

    }
}
