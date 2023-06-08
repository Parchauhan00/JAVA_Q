import java.util.*;
public class Hash_Map_Creation {
    public static void main(String[] args) {
        //Country(Key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();
        // Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);
        map.put("China",130);
        System.out.println(map);

        //Search operation
        if (map.containsKey("China")) {
            System.out.println("Present in the map");
        }
        else System.out.println("Not present in the Map");

        System.out.println(map.get("India")); // Key exist

        System.out.println(map.get("Japan")); // key dsent exist

        int arr[] = {12,15,18};
        for (int i =0;i<arr.length;i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
        for (int val : arr) {
            System.out.println(val+ " ");
        }
        System.out.println();

        // here is set of pairs
     for (Map.Entry<String, Integer>e : map.entrySet()) {
         System.out.println(e.getKey());
         System.out.println(e.getValue());
     }

     // Here is only set of keys
     Set<String> keys = map.keySet();
     for (String key : keys) {
         System.out.println(key +" "+ map.get(key));
     }
     // Remove
        map.remove("China");
        System.out.println(map);
    }
}
