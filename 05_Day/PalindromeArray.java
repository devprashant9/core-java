import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        boolean palindromeArray = checkPalindromeArray(array);
        if(palindromeArray == true) System.out.println("Array is Palindrome");
        else System.out.println("Array is NOT Palindrome");

        sc.close();
    }
    public static boolean checkPalindromeArray(int[] array){
        int i = 0;
        int j = array.length - 1;

        while(i <= j){
            if(array[i] != array[j]) return false;
            i++;
            j--;
        }
        return(true);
    }
}

// 2 4 5 4 2
// 0 1 2 3 4
