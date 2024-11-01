import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks = sc.nextInt();

        String res1 = marks > 80 ? "High" : marks >= 50 && marks <= 80 ? "Moderate" : "Low";

        System.out.println("Result of Student is: " +res1);

        sc.close();
    }
}