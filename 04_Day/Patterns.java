import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.err.println("================ \n");

        leftPyramidTriangle(rows);
        invertedLeftPyramidTriangle(rows);
        rightPyramidTriangle(rows);

        sc.close();
    }

    public static void leftPyramidTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedLeftPyramidTriangle(int rows) {
        System.err.println("================ \n");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightPyramidTriangle(int rows) {
        System.err.println("================ \n");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
