import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        float area = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Breadth of the Triangle: ");
        float breadth = sc.nextFloat();
        System.out.println("Enter Height of the Triangle: ");
        float height = sc.nextFloat();

        area = 0.5f * breadth * height;
        System.out.println("Perimeter is: " +area);

        sc.close();
    }
}
