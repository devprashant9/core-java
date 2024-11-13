package Day_17_ExecutorService;

public class PrintTask extends Thread {
    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            System.out.printf(" %s %d : %s \t", Thread.currentThread().getName(), i, targetChar);
        }
    }
}