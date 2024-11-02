import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter N to Exit and Y to Continue: ");
            c = sc.nextLine().charAt(0);
            if(c == 'Y') {
                int num = (int)Math.round(Math.random() * 10);
                if(num < 1 || num > 6) {
                    System.out.println("Number Skipped: ");
                    continue;
                }
                else System.out.println(num);
            }
        } while (c != 'N');

        sc.close();
    }
}
