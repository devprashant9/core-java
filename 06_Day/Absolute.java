import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int result = num < 0 ? -num : num;
        System.out.println("The NUmber is: "+result);

        sc.close();
    }
}