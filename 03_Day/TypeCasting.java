public class TypeCasting {
    public static void main(String[] args) {
        float floatNum = 89789L; // long is stored in float automatically
        System.out.println(floatNum);

        // int intNum = 33.6898f; // error

        int intNum = (int)33.6898f; // forcing float value to be stored in num. It removes the digits after decimal.
        System.out.println(intNum);
    }
}