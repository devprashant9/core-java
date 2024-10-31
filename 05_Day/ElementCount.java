import java.util.Scanner;

public class ElementCount {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length of the Array: ");
    int length = sc.nextInt();
    int[] arr = new int[length];
    System.out.println("Enter Array Elemnts: ");
    for(int i = 0; i < length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter Element Whose Count is to be Found: ");
    int num = sc.nextInt();
    int counter = countOccurrence(arr, num);
    System.out.println("The Element " + num + " Has Occurred " + counter + " Times");

    sc.close();
   }
   public static int countOccurrence(int[] arr, int num){
    int counter = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == num) counter++;
    }
    return(counter);
   } 
}
