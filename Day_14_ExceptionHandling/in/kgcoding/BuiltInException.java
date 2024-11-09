package Day_14_ExceptionHandling.in.kgcoding;

public class BuiltInException {
    public static void main(String[] args) {
        printName("Prashant Kumar");
        printName("Prashant-Kumar");
    }

    public static void printName(String name) throws IllegalArgumentException {
        if(name.contains("-")) {
            throw new IllegalArgumentException("Name Contains -");
        }
        System.out.println(name);
    }
}
