package Day_15_Collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple");
        set.add("mango");
        PrintInterface.print(set);
        System.out.println("=============");
        set.remove("banana");
        PrintInterface.print(set);
        System.out.println(set.isEmpty());
    }
}
