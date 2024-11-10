package Day_15_Collection;

import java.util.Collection;

public class PrintInterface {

    public static <E> void print(Collection<E> obj) {
        for (E i : obj) {
            System.out.println(i);
        }
    }
}
