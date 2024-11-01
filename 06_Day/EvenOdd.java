import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("The NUmber is: "+result);

        sc.close();
    }
}