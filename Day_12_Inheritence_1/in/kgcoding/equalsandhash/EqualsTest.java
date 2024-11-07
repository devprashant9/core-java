package Day_12_Inheritence_1.in.kgcoding.equalsandhash;

public class EqualsTest {
    public static void main(String[] args) {
        Person person1 = new Person("Prashant", 23, "009");
        Person person2 = new Person("Prashant", 24, "009");

        System.out.println(person1 == person2); // false
        System.out.println(person1.equals(person2)); // false if equals() method is not overridden

        // To function equals() method correctly we need to override this method defined
        // in Object class. Then if we call two object it will show true and false in
        // case of different values

        /**
         * Person person1 = new Person("Prashant", 23, "009");
         * Person person2 = new Person("Prashant", 23, "009");
         * true after redefinig equals() method but same values
         */

        /**
         * Person person1 = new Person("Prashant", 23, "009");
         * Person person2 = new Person("Prashant", 20, "009");
         * false after redefinig equals() method but different values
         */
    }
}
