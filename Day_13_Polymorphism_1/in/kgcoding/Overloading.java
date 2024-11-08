package Day_13_Polymorphism_1.in.kgcoding;

public class Overloading {
    public static void main(String[] args) {
        Sum(5, 7); //automatically call double method 
        Sum(2.5f, 3.5f);
        Sum(2.6999, 8.69);
        Sum(5, 8, 10);
    }

    public static void Sum(float a, float b) {
        System.out.println(a + b);
    }

    public static void Sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void Sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
