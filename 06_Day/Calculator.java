import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();

        int result = switch(choice) {
            case 1 -> number1 + number2;
            case 2 -> number1 - number2;
            case 3 -> number1 * number2;
            case 4 -> number1 / number2;
            default -> choice;
        };
        if(choice < 0 || choice > 4) System.out.println("Wrong Choice");
        else System.out.println("The Result is: "+result);

        sc.close();
    }
}
