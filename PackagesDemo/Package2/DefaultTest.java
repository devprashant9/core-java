package PackagesDemo.Package2;

import PackagesDemo.Package1.Car;

public class DefaultTest {

    public static void main(String[] args) {
        Car ob = new Car("Yellow", "Dzire", 5, 3000);
        // ob.costOfPurchase = 6000; //not accessible
        System.out.println(ob);
    }
}