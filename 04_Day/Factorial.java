import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        factorial(num, 1);

        sc.close();
    }
    public static void factorial(int num, int fact){
        int i = 1;
        while(i <= num){
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
