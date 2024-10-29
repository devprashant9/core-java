import java.util.Scanner;

public class Cateogries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if(age < 13) System.out.println("Child");
        else if(age <= 20) System.out.println("Teen");
        else if(age < 60) System.out.println("Adult");
        else if(age >= 60) System.out.println("Senior");

        sc.close();
    }
}
