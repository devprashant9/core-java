import java.util.Scanner;

public class MaimumArray {
    public static void main(String[] args) {
        int maximum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int num : arr) {
            maximum = num > maximum ? num : maximum;
        }
        System.out.println("The Maximum Element is: "+maximum);

        sc.close();
    }
}
