import java.util.*;
public class SumFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        int Sum = Sum(num1, num2); // passing argument

        System.out.println("The Sum is: " +Sum);

        sc.close();
    }
    public static int Sum(int num1, int num2){ // accepting parameter
        return(num1 + num2);
    }
}
