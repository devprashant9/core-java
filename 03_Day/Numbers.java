import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if(num > 0) System.out.println("Positive Number");
        else if(num < 0) System.out.println("Negative Number");
        else System.out.println("Number is Zero");

        sc.close();
    }
}
