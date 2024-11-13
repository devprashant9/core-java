package Day_17_ExecutorService;

import java.util.concurrent.Callable;

public class ReturningFuturesDemo implements Callable <String> {
    private final String name;

    public ReturningFuturesDemo(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Getting Name of: " +this.name);
        Thread.sleep(4000);
        return(name + " Indian");
    }

}
