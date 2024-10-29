import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st NUmber: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd NUmber: ");
        int b = sc.nextInt();
        System.out.println("===================");
        System.out.println("Sum: " +(a + b));
        System.out.println("Subtraction: " +(a - b));
        System.out.println("Multiplication: " +(a * b));
        System.out.println("Division: " +(a / b));
        System.out.println("Modulus or Remainder: " +(a % b));

        sc.close();
    }
}
