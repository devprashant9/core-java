import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Print Multiplication Table: ");
        int num1 = sc.nextInt();
        System.out.println("Multiplication Table of: " +num1);
        int i = 1;
        while(i <= 10) {
            System.out.println(num1 + " X " + i + " = " + (num1 * i) );
            i++;
        }

        sc.close();
    }
}
