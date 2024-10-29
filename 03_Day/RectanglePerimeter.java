import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        float perimeter = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Reactangle: ");
        float length = sc.nextFloat();
        System.out.println("Enter Breadth of the Reactangle: ");
        float breadth = sc.nextFloat();

        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter is: " +perimeter);

        sc.close();
    }
}
