package Day_16_MultiThreading;

public class ThreadPriorityDemo extends Thread {
    private final char targetChar;

    public ThreadPriorityDemo(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println();
            System.out.printf(" %d : %s \n", i, targetChar);
        }
    }

    public static void main(String... args) {
        UsingThreadClass t1 = new UsingThreadClass('*');
        UsingThreadClass t2 = new UsingThreadClass('#');
        UsingThreadClass t3 = new UsingThreadClass('$');

        t1.start();
        t2.start();
        t3.start();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
    }
}
