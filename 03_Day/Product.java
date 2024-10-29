import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        float result = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd Number: ");
        float num2 = sc.nextFloat();

        result = num1 * num2;
        System.out.println("Product is: " +result);

        sc.close();
    }
}
