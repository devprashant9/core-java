import java.util.*;

public class BreakLoop {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("You Can Enter -1 to Stop");
        do {
            System.out.println("Enter a Number: ");
            num = sc.nextInt();
        } while (num != -1);

        sc.close();
    }
}
