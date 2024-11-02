
public class ToStringMethod {
    int wheels;
    int doors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    ToStringMethod(int wheels, int doors, int maxSpeed, String name, String modelNumber, String company) {
        this.wheels = wheels;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "My Car name is: " +name;
    }

    public static void main(String[] args) {
        ToStringMethod swift = new ToStringMethod(4, 4, 160, "Maruti", "85965", "Suzuki");

        System.out.println(swift.toString()); //defaultOutput: classname@hash
        System.out.println(swift);
    }
}
