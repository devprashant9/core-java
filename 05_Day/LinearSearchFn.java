import java.util.Scanner;
public class LinearSearchFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Elements in Array: ");
        for(int i = 0; i < length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Element to be Found: ");
        int target = sc.nextInt();

        boolean result = Search(array, target);
        if(result == true) System.out.println("Element Found");
        else System.out.println("Element NOT Found");

        sc.close();
    }
    public static boolean Search(int[] arr, int target){
        int i = 0;
        int flag = 0;
        while(i < arr.length){
            if(arr[i] == target){
                flag = 1;
                break;
            }
        }
        if(flag == 1) return(true);
        else return(false);
    }
}
