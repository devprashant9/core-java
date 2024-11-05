package Day_10_Encapsulation_2.in.knowledgegate;

import Day_10_Encapsulation_2.in.kgcoding.Public;

public class TestPublic {

            // Accessing from different Package in.knowledgegate
    public static void main(String[] args) {
        Public car1 = new Public();
        car1.carColour = "Red";
        car1.modelNumber = "BMW_S_Classic";
        // car.fuelLevel = 14.5; // Field Not Visible Error
        // same for cost of purchase
        System.out.println(car1);

        Public car2 = new Public("Pink", "Mahindra", 10.67, 70000000);
        System.out.println(car2);
    }
}