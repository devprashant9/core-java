package Day_12_Inheritence_1.in;

public class ObjectTest {
    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass();
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
        System.out.println(obj.toString()); // returns a hash if not overridden
    }
}
