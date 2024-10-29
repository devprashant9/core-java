public class UnaryOperator {
    public static void main(String[] args) {
        int x = 5;

        int y1 = x;
        System.out.println(y1);
        int y2 = -y1;
        System.out.println(y2);
        System.out.println("=================");
        int a = 10;
        int b = 20;
        System.out.println(++a); // increases by 1
        System.out.println(--b); // decreases by 1

        System.out.println("==================");

        System.out.println(a++); // gives the current value i.e. 11
        System.out.println(b--); // gives the current value i.e. 19

        // Now if we use a or b it will use the new value. Let's say we want to add.
        // so the result mult be like this
        // a = 12 and b = 18, so the sum must be 30
        System.out.println(a + b); // uses new value after post increment
        System.out.println(a + 5); // uses new value after post increment
        System.out.println(b - 10); // uses new value after post increment
    }
}
