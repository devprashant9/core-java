import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check for Prime Number: ");
        int num = sc.nextInt();

        int counter = primeCheck(num, 0);
        display(counter);

        sc.close();
    }
    public static int primeCheck(int num, int counter){
        int i = 1;
        while(i <= num) {
            if(num % i == 0) counter++;
            i++;
        }
        return(counter);
    }
    public static void display(int count){
        if(count == 2) System.out.println("Number is Prime.");
        else System.out.println("Number is Not Prime.");
    }
}
