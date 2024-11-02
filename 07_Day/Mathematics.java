public class Mathematics {
    public static void main(String[] args) {
        System.out.println(Math.abs(-23));
        System.out.println(Math.abs(53));
        System.out.println(Math.ceil(78.02));
        System.out.println(Math.floor(88.99));
        System.out.println(Math.round(64.4));
        System.out.println(Math.round(64.5));
        System.out.println(Math.PI);
        
        
        // Generates Random Number Between 0.0 and 1.0
        System.out.println(Math.random());
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random() * 100));
        }
    }
}