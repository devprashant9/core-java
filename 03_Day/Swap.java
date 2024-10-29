import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("Value Before Swapping");
        System.out.println("Num 1 = " + num1 + " and " + "Num 2 = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Value After Swapping");
        System.out.println("Num 1 = " + num1 + " and " + "Num 2 = " + num2);

        sc.close();
    }
}
