import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double interest = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the Rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the Time Period: ");
        float time = sc.nextFloat();

        interest = principal * Math.pow((1 + (rate / 100)), time);
        System.out.println("Simple Interest is: " +interest);

        sc.close();
    }
}
