package Day_14_ExceptionHandling.in.kgcoding;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            try {
                int result = 1 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Something Caught");
            } finally {
                System.out.println("Not Quite Fiinally");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caight");
        } finally {
            System.out.println("Finally");
        }
    }
}
