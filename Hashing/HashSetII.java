import java.util.HashMap;
import java.util.*;

public class HashSetII {
    public static void main(String[] args) {
// Iteration on HashMap

        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        hm.put("Indonesia", 6);
        hm.put("nepal", 5);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key=" +k+ ",value" +hm.get(k));
        }

    }
}