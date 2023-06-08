import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();

        //Insert   O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us", 50);

//        System.out.println(hm);
//
//        //Get - O(1)
//
//       int population =  hm.get("India");
//        System.out.println(population);
//
//        System.out.println(hm.get("Indonesia")); // if key exist nahi krti to null value de dega
//
//        //Contains Key  O(1)  it will return true or false
//        System.out.println(hm.containsKey("India"));
//        System.out.println(hm.containsKey("Bhutan"));

        // Remove Operation  O(1)
        System.out.println(hm.remove("China"));  // if key nahi ha to null return krega or map me koi change nahi hoga
        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        // Clear
        hm.clear(); // Entire map ko khali kr dega
        System.out.println(hm);




    }
}
