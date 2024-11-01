import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Terms: ");
        int num = sc.nextInt();
        Fibonacci ob = new Fibonacci();
        ob.fibonacci(0, 1, num);

        sc.close();
    }
    public void fibonacci(int num1, int num2, int length){
        if(length <= 0) return ;
        System.out.print(num1 + " ");
        fibonacci(num2, num1 + num2, length - 1);
    }
}