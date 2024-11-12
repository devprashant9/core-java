package Day_16_MultiThreading;

public class UsingRunnableInterface implements Runnable{
    private final char targetChar;

    public UsingRunnableInterface(char targetChar) {
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
        UsingRunnableInterface p1 = new UsingRunnableInterface('*');
        UsingRunnableInterface p2 = new UsingRunnableInterface('#');
        UsingRunnableInterface p3 = new UsingRunnableInterface('$');

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
    }
}
