import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int minimum = Minimum(array);
        int maximum = Maximum(array);

        System.out.println("Minimum is: " + minimum);
        System.out.println("Maximum is: " + maximum);

        sc.close();
    }

    public static int Minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return(min);
    }

    public static int Maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return(max);
    }
}