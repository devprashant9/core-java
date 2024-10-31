import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the Element to be Deleted: ");
        int delete = sc.nextInt();
        System.out.println("New Array Updated is: ");
        int[] deleted = deleteElement(array, delete);
        for (int i = 0; i < deleted.length; i++) {
            System.out.println(deleted[i]);
        }

        sc.close();
    }
    public static int[] deleteElement(int[] array, int delete){
        int[] arr = new int[array.length - 1];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(delete == array[i]) continue;
            else {
                arr[j] = array[i];
                j++;
            }
        }
        return(arr);
    }
}