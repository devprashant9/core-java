package Day_16_MultiThreading;

public class ImplementSynchronize extends Thread {
    private final SynchronizeMethod counter;

    public ImplementSynchronize(SynchronizeMethod counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            counter.increment();
        }
    }
}
