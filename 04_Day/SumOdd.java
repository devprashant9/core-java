import java.util.*;
public class SumOdd {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Upper Limit: ");
        int upperLimit = sc.nextInt();
        int i = 0;
        while(i <= upperLimit) {
            if( i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of Odd Numbers Till " + upperLimit + " is " + sum);

        sc.close();
    }
}
