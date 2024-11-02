package PackagesDemo.Package1;

public class Test {
    public static void main(String[] args) {
        Car ob1 = new Car("Red", "Suzuki", 25, 86000);
        System.out.println(ob1);

        Car ob2 = new Car();
        ob2.colour = "Black";
        ob2.model = "BMW";
        // ob2.fuellevel = 26; //private field
        ob2.costOfPurchase = 250000;
        System.out.println(ob2);
    }
}
