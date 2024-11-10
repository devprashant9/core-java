package Day_15_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();
        queue.offer("Prashant");
        queue.add("Kumar");
        PrintInterface.print(queue);

        queue.remove();
        queue.poll();
        queue.poll();
        queue.remove();
        
        System.out.println(queue.peek());
        PrintInterface.print(queue);

    }
}
