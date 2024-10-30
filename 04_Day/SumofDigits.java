import java.util.*;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        sumOfDigits(num, 0);

        sc.close();
    }
    public static void sumOfDigits(int num, int sumDigits){
        int newNum = num;
        int rem;
        while(num != 0){
            rem = num % 10;
            sumDigits += rem;
            num /= 10;
        }
        System.out.println("Sum of Digits of " + newNum + " is " + sumDigits);
    }
}
