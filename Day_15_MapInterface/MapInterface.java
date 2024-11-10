package Day_15_MapInterface;

import java.util.Map;
import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();

        map.put(1, "Prashant");
        map.put(2, "Ankit");
        map.put(3, "Shubham");
        map.put(4, "Prasad");
        map.put(4, "Nikhil"); //points to current object

        System.out.println(map.get(2));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.remove(1));
    }
}
