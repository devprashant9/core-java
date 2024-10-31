import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of 1st Array: ");
        int length1 = sc.nextInt();
        int[] array1 = new int[length1];
        System.out.println("Enter 1st Array Elements: ");
        inputArray(array1, length1, sc);

        System.out.println("Enter Length of 2nd Array: ");
        int length2 = sc.nextInt();
        int[] array2 = new int[length2];

        System.out.println("Enter 2nd Array Elements: ");
        inputArray(array2, length2, sc);

        mergeSortedArrays(array1, array2);

        sc.close();
    }

    public static void inputArray(int[] array, int length, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void mergeSortedArrays(int[] array1, int[] array2) {
        int j = 0;
        int[] array = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = array1.length; i < array.length; i++) {
            array[i] = array2[j];
            j++;
        }
        System.out.println("Merged Array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
