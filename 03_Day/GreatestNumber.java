import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) System.out.println(num1 + " is Greater than " + num2 + " and " + num3);
        else if(num2 > num1 && num2 > num3) System.out.println(num2 + " is Greater than " + num1 + " and " + num3);
        else System.out.println(num3 + " is Greater than " + num1 + " and " + num2);

        sc.close();
    }
}
