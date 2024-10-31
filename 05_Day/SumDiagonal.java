import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        int sumRight = 0, sumLeft = 0;
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
            }
        }
        System.out.println("The Matrix is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");  
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i == j) sumLeft += matrix[i][j];
                if(i + j == columns - 1) sumRight += matrix[i][j];
                
            }
        }

        System.out.println("Sum of Left Diagonal is: " +sumLeft);
        System.out.println("Sum of Right Diagonal is: " +sumRight);

        sc.close();
    }
}
