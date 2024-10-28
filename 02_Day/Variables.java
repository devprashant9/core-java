public class Variables {
    public static void main(String[] args) {
        int myNumber = 55;
        System.out.println("This is a Integer Value: " +myNumber);
        long longNumber = 6L;
        System.out.println("This is a Long Value: " +longNumber);
        float floatNumber = 5.6f;
        System.out.println("This is a Float Value: " +floatNumber);
        double doubleNumber = 100d;
        System.out.println("This is a Double Value: " +doubleNumber);
        
        System.out.println("============");
        
        int num1 = 99;
        System.out.println("Value Before Overwriting: " +num1);
        num1 = 510; // overwriting previous value of a variable
        System.out.println("Value After Overwriting: " +num1); //510

        System.out.println("============");

        String name = "Prashant";
        System.out.println("This is a String Value: " +name);

        char c = 'A';
        System.out.println("This is a Character Value: " +c);
    }
}
