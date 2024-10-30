import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        if(num1 < 0 || num2 < 0) greatestCommonDivisor(Math.abs(num1), Math.abs(num2));
        else if(num1 == 0 && num2 == 0) System.out.println("GCD of " + num1 + " and " + num2 + " is " + num1);
        else if(num1 == 0) System.out.println("GCD of " + num1 + " and " + num2 + " is " + num2);
        else if(num2 == 0) System.out.println("GCD of " + num1 + " and " + num2 + " is " + num1);
        else greatestCommonDivisor(num1, num2);

        sc.close();
    }
    public static void greatestCommonDivisor(int num1, int num2){
        int remainder = 0;
        while(num2 != 0){
            remainder = num1 % num2;

            num1 = num2;
            num2 = remainder;
        }
        System.out.println(num1);
    }
}
