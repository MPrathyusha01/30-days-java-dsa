package Day11;

import java.util.HashMap;

public class SizeHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("Size of the HashMap: " + map.size());
    }
}
