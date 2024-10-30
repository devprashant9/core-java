import java.util.*;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is " + (num1 & num2));
        System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is " + (num1 | num2));
        System.out.println("Bitwise XOR of " + num1 + " and " + num2 + " is " + (num1 ^ num2));
        System.out.println("Bitwise Compliment of " + num1 + " is " + ~num1);
        System.out.println("Bitwise Compliment of " + num2 + " is " + ~num2);

        System.out.println("Bitwise Left Shift of " + num1 + " is " + (num1 << 2));
        System.out.println("Bitwise Right Shift of " + num2 + " is " + (num2 >> 2));
        sc.close();
    }
}