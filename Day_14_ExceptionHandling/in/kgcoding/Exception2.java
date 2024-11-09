package Day_14_ExceptionHandling.in.kgcoding;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by Zero"); // shows this error message
        }

        sc.close();
    }
}
