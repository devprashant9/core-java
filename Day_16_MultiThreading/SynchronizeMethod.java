package Day_16_MultiThreading;

public class SynchronizeMethod {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return(count);
    }
}
