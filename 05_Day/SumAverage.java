import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < length; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("The Sum is: " +sum);
        System.out.println("The Average is: " +(sum/length));

        sc.close();
    }
}
