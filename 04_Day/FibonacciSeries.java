import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Terms: ");
        int num = sc.nextInt();

        fibonacciSeries(0, 1, num);

        sc.close();
    }
    public static void fibonacciSeries(int a, int b, int length){
        int i = 3;
        System.out.print("Fibonacci Series is: ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        while(i <= length){
            int temp = a + b;
            System.out.print(temp + " ");

            a = b;
            b = temp;
            i++;
        }
    }
}