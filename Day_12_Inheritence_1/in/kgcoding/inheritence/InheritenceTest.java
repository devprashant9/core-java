package Day_12_Inheritence_1.in.kgcoding.inheritence;

public class InheritenceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();
        
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.start();
        motorCycle.commute();
        motorCycle.balance();
    }
}
