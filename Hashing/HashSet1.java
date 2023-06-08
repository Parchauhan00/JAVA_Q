import java.util.HashSet;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

//     //   System.out.println(set);
//
//        Iterator it = set.iterator();
//        for (; it.hasNext();) {
//           // System.out.println(it.next());
//        }
//
//
//        // Advance loop
//        for (Integer v : set) {
//           // System.out.println(v);
//        }
//        if (set.contains(2)) {
//            System.out.println("Set contains : ");
//        }else {
//            System.out.println("Not contains");
//        }
//
//        set.clear();
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengalurur");
      //  System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengalurur");
        System.out.println(ts);


    }
}
