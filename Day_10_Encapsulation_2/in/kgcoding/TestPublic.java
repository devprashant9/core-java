package Day_10_Encapsulation_2.in.kgcoding;

public class TestPublic {
    public static void main(String[] args) {
        
        // Accessing from Same Package in.kgcoding
        
        Public car1 = new Public();
        car1.carColour = "Black";
        car1.modelNumber = "BMW_S_Classic";
        // car.fuelLevel = 14.5; // Field Not Visible Error
        // same for cost of purchase
        System.out.println(car1);

        Public car2 = new Public("White", "Mahindra", 10.67, 70000000);
        System.out.println(car2);

    }
}
