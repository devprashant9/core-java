import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of the Student in Percentage");
        int marks = sc.nextInt();
        if(marks >= 90) System.out.println("Grade A");
        else if(marks >= 75) System.out.println("Grade B");
        else if(marks >= 60) System.out.println("Grade C");
        else if(marks >= 30) System.out.println("Grade D");
        if(marks < 30) System.out.println("Grade F");

        sc.close();
    }
}
