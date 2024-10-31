public class Array {
    public static void main(String[] args) {
        int row = 2, column = 2;
        int[][] array2D = new int[row][column];
        int [][] array = {{10, 20, 30, }, {45, 90, 56}}; //it may contain different columns but for sake of simplicity it is kept evenly

        array2D[0][0] = 90;
        array2D[0][1] = 60;
        array2D[1][0] = 30;
        array2D[1][1] = 10;
        System.out.println(array2D[0][1]);
        System.out.println(array2D[1][1]);
        System.out.println("==========");
        System.out.println(array[0][0]);
        System.out.println(array[1][0]);
        System.out.println("===========");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
