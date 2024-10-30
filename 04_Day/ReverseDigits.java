import java.util.*;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit to Reverse: ");
        int num = sc.nextInt();

        reverseDigit(num, 0);

        sc.close();
    }
    public static void reverseDigit(int num, int revDigits){

        int rem;
        while(num != 0){
            rem = num % 10;
            revDigits = revDigits * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed Digit is: " +revDigits);
    }
}
