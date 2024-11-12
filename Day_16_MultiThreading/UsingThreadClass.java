package Day_16_MultiThreading;

public class UsingThreadClass extends Thread {
    private final char targetChar;

    public UsingThreadClass(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println();
            System.out.printf(" %d : %s", i, targetChar);
        }
    }

    public static void main(String... args) {
        UsingThreadClass t1 = new UsingThreadClass('*');
        UsingThreadClass t2 = new UsingThreadClass('#');
        UsingThreadClass t3 = new UsingThreadClass('$');

        t1.start();
        t2.start();
        t3.start();
    }
}
