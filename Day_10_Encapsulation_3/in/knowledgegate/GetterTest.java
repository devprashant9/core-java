package Day_10_Encapsulation_3.in.knowledgegate;

import Day_10_Encapsulation_3.in.GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "BMW", 45, 95000);
        System.out.println(car1.getColour());
        System.out.println(car1.getModel());
        car1.setColour("Pink");
        car1.setModel("Audi");
        System.out.println(car1);
    }
}
