package Day_13_Polymorphism_1.in;

public class Overriding {
    public void getName() {
        System.out.println("Name is: ");
    }

    public static class Employee extends Overriding {
        String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override //not necessary only for readability
        public void getName() { //re-implementing parent class method. signature must be same
            System.out.println("Name is: " + this.name);
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Employee emp = new Employee("Prashant Kumar");
            emp.getName();
        }
    }
}
