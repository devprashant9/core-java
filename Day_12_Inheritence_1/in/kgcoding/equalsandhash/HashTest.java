package Day_12_Inheritence_1.in.kgcoding.equalsandhash;

public class HashTest {
    public static void main(String[] args) {
        Person person1 = new Person("Prashant", 23, "009");
        Person person2 = new Person("Prashant", 24, "009");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        // Same HashCode for Same Values
        // Same HashCode for Differnt Values
        // Same Values Cannot Have Different HashCode
        // HashCode Has Higher Priority Than Equals()
        // If HashCode is Same, Equals() Has to be Same
        // If HashCode is Different, Equals() is Either Same or Different
        // Must be Overridden Together to Maintain Consistency
    }
}
