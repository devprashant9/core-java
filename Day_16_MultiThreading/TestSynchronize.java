package Day_16_MultiThreading;

public class TestSynchronize {
    public static void main(String[] args) throws InterruptedException {
        SynchronizeMethod sync = new SynchronizeMethod();
        ImplementSynchronize imp1 = new ImplementSynchronize(sync);
        ImplementSynchronize imp2 = new ImplementSynchronize(sync);

        imp1.start();
        imp2.start();

        imp1.join();
        imp1.join();
        
        System.out.println(sync.getCount());
    }
}
