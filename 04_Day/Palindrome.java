import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check Plaindrome: ");
        int num = sc.nextInt();

        int newNum = checkPlaindrome(num, 0);
        display(num, newNum);

        sc.close();
    }
    public static int checkPlaindrome(int num, int newDigit){
        int rem = 0;
        while(num != 0){
            rem = num % 10;
            newDigit = newDigit * 10 + rem;
            num /= 10;
        }
        return(newDigit);
    }
    public static void display(int num, int newNum){
        if(num == newNum) System.out.println("Palindrome Number");
        else System.out.println("NOT Palindrome Number");
    }
}
