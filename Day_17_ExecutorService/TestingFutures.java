package Day_17_ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        ReturningFuturesDemo task1 = new ReturningFuturesDemo("Prashant");
        ReturningFuturesDemo task2 = new ReturningFuturesDemo("Ankit");
        ReturningFuturesDemo task3 = new ReturningFuturesDemo("Nikhil");
        ReturningFuturesDemo task4 = new ReturningFuturesDemo("Dnyanesh");

        Future <String> name1 = service.submit(task1);
        Future <String> name2 = service.submit(task2);
        Future <String> name3 = service.submit(task3);
        Future <String> name4 = service.submit(task4);

        System.out.println("Name is: " +name1.get());
        System.out.println("Name is: " +name2.get());
        System.out.println("Name is: " +name3.get());
        System.out.println("Name is: " +name4.get());

        service.shutdown();
    }
}
