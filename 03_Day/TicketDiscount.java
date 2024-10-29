import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Gender: ");
        char gender = sc.nextLine().charAt(0);

        if(age < 5) {
            System.out.println("Discount is 75%.");
        }
        else if(gender == 'F') {
            System.out.println("Discount is 50%.");
        }
        else if(gender == 'F' && age > 60) {
            System.out.println("Discount is 25%");
        }
        else {
            System.out.println("No Discount is Available.");
        }

        sc.close();
    }
}
