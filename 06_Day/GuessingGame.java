import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a Number: ");
            num = sc.nextInt();
            if(num < 10) System.out.println("Game Value is Higher");
            else if(num > 10) System.out.println("Game Value is Lower");
            else System.out.println("You Guessed the Game Value");
        } while (num != 10);

        sc.close();
    }
}
