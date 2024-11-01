import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nbd Number: ");
        int num2 = sc.nextInt();

        int minimum = num1 < num2 ? num1 : num2;
        System.out.println("Minimum is: "+minimum);

        sc.close();
    }
}
