import java.util.Scanner;

public class SearchTwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter Matrix Element Row Wise: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Element to be Found: ");
        int target = sc.nextInt();

        boolean check = search(matrix, target, rows, columns);
        System.out.println(check);

        sc.close();
    }
    public static boolean search(int[][] matrix, int target, int rows, int columns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
