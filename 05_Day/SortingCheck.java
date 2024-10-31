import java.util.Scanner;

public class SortingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < length; i++){
            array[i] = sc.nextInt();
        }

        boolean check = sortingChecking(array);

        if(check == true) System.out.println("Array is Sorted");
        else System.out.println("Array is NOT Sorted");

        sc.close();
    }
    public static boolean sortingChecking(int[] array){
        boolean ascending = true;
        boolean descending = true;
        for(int i = 1; i < array.length; i++){
            if(array[i - 1] > array[i]) ascending = false;
            else if(array[i - 1] < array[i]) descending = false;
        }
        return(ascending || descending);
    }
}