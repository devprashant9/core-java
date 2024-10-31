import java.util.*;

public class SumAverageTwoDimensional {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter Matrix Element Row Wise: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }
        System.out.println("The Matrix is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The Sum is: " +sum);
        System.out.println("The Average is: " +(sum/(rows + columns)));

        sc.close();
    }
}
