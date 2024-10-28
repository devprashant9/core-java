import java.util.*;
public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");
        sc.close();
    }
}
