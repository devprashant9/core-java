package Day_14_ExceptionHandling.in.kgcoding;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = num1 / num2; // shows error in terminal
        System.out.println(res);

        sc.close();
    }
}
