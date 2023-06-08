import java.util.HashSet;
import java.util.Iterator;

//   Set
public class Hashing {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  // list.add(el)

        // search - contains
        if (set.contains(1)) {
            System.out.println("Set contains");   // it return true thenit will print false pr print nahi hoga
        }
        if (!set.contains(6)) {
            System.out.println("Set doesn't contain" );
        }
        System.out.println("size is " + set.size());
        // Print all elements
        System.out.println(set);
        // Itrator
        Iterator it = set.iterator();
        // hasNext , next function

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
