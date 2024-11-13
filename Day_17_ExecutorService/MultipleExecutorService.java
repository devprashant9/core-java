package Day_17_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('#');
        PrintTask task3 = new PrintTask('$');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();

        if(!service.awaitTermination(10, TimeUnit.SECONDS)) {
            service.shutdownNow(); //main thread waits for 10 seconds. If job is done before time its good or else this method is executed
        }
    }
}
