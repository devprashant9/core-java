import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array: ");
        int length = sc.nextInt();

        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter Element to be Found: ");
        int target = sc.nextInt();

        for(int i = 0; i < length; i++){
            if(array[i] == target){
                flag = 1;
                break;
            }
        }

        if(flag == 1) System.out.println("Elemnt Found in Array");
        else System.out.println("Element Not Found");

        sc.close();
    }
}
