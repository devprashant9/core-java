import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        if(num1 < 0 || num2 < 0) leastCommonMultiple(Math.abs(num1), Math.abs(num2));
        else if(num1 == 0 && num2 == 0) System.out.println("LCM of " + num1 + " and " + num2 + " is " + num1);
        else leastCommonMultiple(num1, num2);

        sc.close();
    }
    public static void leastCommonMultiple(int num1, int num2){
        System.out.println((num1 * num2)/greatestCommonDivisor(num1, num2));
    }

    public static int greatestCommonDivisor(int num1, int num2){
        int remainder = 0;
        while(num1 != 0){
            remainder = num2 % num1;

            num2 = num1;
            num1 = remainder;
        }
        return(num2);
    }
}
