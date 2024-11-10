package Day_15_Collection;


import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List <Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(88);
        numList.add(90);
        numList.add(245);

        PrintInterface.print(numList);

        System.out.println(numList.get(0));

        numList.add(1, 90);
        PrintInterface.print(numList);

        numList.remove(0);
        PrintInterface.print(numList);

        numList.set(1, 100);
        PrintInterface.print(numList);

    }
}
