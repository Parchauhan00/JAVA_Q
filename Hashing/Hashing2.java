import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {
        // Country (Key), population(value)
        HashMap<String , Integer> map1 = new HashMap<>();

        // Insertion
        map1.put("India", 120);
        map1.put("China",135);
        map1.put("USA", 40);

        System.out.println(map1);
        map1.put("USA",50);
        System.out.println(map1);

        // Search
//        if (map1.containsKey("China")) {
//            System.out.println("China Exist in Map");
//        }
//        else {
//            System.out.println("China Doesn't Exist");
//        }
//        System.out.println(map1.get("China"));  // Key exist
//        System.out.println(map1.get("Indonesia"));  // Key doesn't exist

        for (Map.Entry<String,Integer> e: map1.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Second Method By Keyset
        Set<String> keys = map1.keySet();
        for (String Key : keys ) {
            System.out.println(Key+ " " + map1.get(Key));
        }

        map1.remove("China");
        System.out.println(map1);


    }
}
