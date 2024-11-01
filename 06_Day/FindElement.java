import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number to be Found:");
        int target = sc.nextInt();
        for (int num : arr) {
            if (num == target) {
                check = true;
                break;
            } else
                check = false;
        }
        if (check)
            System.out.println("Number is Present");
        else
            System.out.println("Number is NOT Present");

        sc.close();
    }
}
