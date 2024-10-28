import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num1 = sc.nextInt();
        System.out.println(num1);
        sc.nextLine(); // to read the next lines if your editor is not automatically doing it
        System.out.println("Enter a Name: ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
