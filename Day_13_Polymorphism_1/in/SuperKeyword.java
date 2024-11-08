package Day_13_Polymorphism_1.in;


public class SuperKeyword {
    int numberOfDoors;

    public SuperKeyword(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void Start() {
        System.out.println("Starting . . ");
    }

    public static class Car extends SuperKeyword {
        public Car(int numberOfDoors) {
            super(numberOfDoors);
        }

        public void numberOfDoorsCar() {
            System.out.println("Number of doors: " + numberOfDoors);
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Car obj = new Car(4);
            obj.numberOfDoorsCar();
            obj.Start();
        }
    }
}
