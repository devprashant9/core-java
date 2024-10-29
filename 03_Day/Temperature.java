import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        float celcius = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        celcius = (fahrenheit - 32) * (5 / 9);
        System.out.println("Fahrenheit: " + fahrenheit + "\n ==> " + "Celcius: " +celcius);

        sc.close();
    }
}
