package Day_14_ExceptionHandling.in.kgcoding;

import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int[] a = new int[5];
            System.out.println(a[6]); //throws the error
            a[6] = num1 / num2;
            System.out.println(a[6]);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by Zero");
            System.out.println(e);
        } catch (Throwable th) { // universal exception catcher
            System.out.println(th);
        }

        sc.close();
    }
}
