package PackagesDemo.Package2;

import PackagesDemo.GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "BMW", 500, 1000);
        System.out.println(car.getColour());
        System.out.println(car.getModel());
        car.setColour("Purple");
        System.out.println(car.getColour());
    }
}
