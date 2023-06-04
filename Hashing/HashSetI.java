import java.util.HashMap;

public class HashSetI {
     public static void main(String[] args) {
        
// create
HashMap<String, Integer> hm = new HashMap<>();

// Insert  O(1)
hm.put("India", 100);
hm.put("China", 150);
hm.put("Us", 50);

// System.out.println(hm);

// // Get - O(1)
// int population = hm.get("India");
// System.out.println(hm);

// System.out.println(hm.get("Indonesia")); // will return null value

// // ContainsKey - O(1)
// System.out.println(hm.containsKey("India"));   // return true if key exist
// System.out.println(hm.containsKey("Bhutan"));  // return false


// // remove - O(1)
// System.out.println(hm.remove("China"));
// System.out.println(hm);


System.out.println(hm.size());


// Is Empty
System.out.println(hm.isEmpty()); // return true is map is empty or false while not empty


// Clear function
hm.clear();
System.out.println(hm.isEmpty());

    }
}