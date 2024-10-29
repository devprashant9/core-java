import java.util.Scanner;
public class ShortHandOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber: ");
        int a = sc.nextInt();
        System.out.println("===================");
        System.out.println("Sum: " +(a += 5)); // value of a is 15
        System.out.println("Difference: " +(a -= 5)); // 15 - 5 = 10
        System.out.println("Product: " +(a *= 5)); // 10 * 5 = 50
        System.out.println("Division: " +(a /= 5)); // 50 / 5 = 10
        System.out.println("Remainder: " +(a %= 5)); // 10 % 2 = 0

        sc.close();
    }
}