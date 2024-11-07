package Day_12_Inheritence_1.in;

public class ObjectClass {
    String name = "Prashant Kumar Jha";
    String course = "MCA";
    int age = 23;
    double weight = 67.300;

    @Override //generating user friendly toString() method
    public String toString() {
        return "ObjectClass [name=" + name + ", course=" + course + ", age=" + age + ", weight=" + weight + "]";
    }

    
}


// This class is automatically extended by compiler if there is no class extended
// By default this is the parent of all class
// It has various in-built functions like hashCode(), equals(), etc.