import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float interest = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the Rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the Time Period: ");
        float time = sc.nextFloat();

        interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " +interest);

        sc.close();
    }
}
