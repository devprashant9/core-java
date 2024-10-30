import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        
        int newDigit = checkArmstrong(num, countDigits(num) , 0);
        display(num, newDigit);

        sc.close();
    }
    public static int countDigits(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return(count);
    }
    public static int checkArmstrong(int num, int digits, int newNumber){
        int rem = 0;
        while(num != 0){
            rem = num % 10;
            newNumber = newNumber + (int)Math.pow(rem, digits);
            num /= 10;
        }
        return(newNumber);
    }
    public static void display(int num, int newDigit){
        if(num == newDigit) System.out.println("Armstrong Number");
        else System.out.println("NOT Armstrong Number");
    }
}
