import java.util.*;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int gameScore = (int) Math.round(Math.random() * 100 - 1);
        do {
            System.out.println("Guess a Number 1 to 99: ");
            num = sc.nextInt();
            if (num == gameScore)
                System.out.println("Correct");
            else if (num < gameScore) {
                System.out.println("Higher");
                continue;
            } else if (num > gameScore) {
                System.out.println("Lower");
                continue;
            }
        } while (num != gameScore);

        sc.close();
    }
}
