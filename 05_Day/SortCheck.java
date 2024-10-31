import java.util.Scanner;

public class SortCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Eleemnts: ");
        for(int i = 0; i < length; i++){
            array[i] = sc.nextInt();
        }

        boolean checkAscending = sortCheckingAscending(array);
        boolean checkDescending = sortCheckingDescending(array);

        if(checkAscending == true || checkDescending == true) System.out.println("Array is Sorted");
        else System.out.println("Array is NOT Sorted");

        sc.close();
    }
    public static boolean sortCheckingAscending(int[] array){
        int flag = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i - 1] < array[i]) {
                flag = 1;
                continue;
            }
            else {
                flag = 0;
                break;
            }
        }
        if(flag == 1) return(true);
        else return(false);
    }
    public static boolean sortCheckingDescending(int[] array){
        int flag = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i - 1] > array[i]) {
                flag = 1;
                continue;
            }
            else {
                flag = 0;
                break;
            }
        }
        if(flag == 1) return(true);
        else return(false);
    }
}
