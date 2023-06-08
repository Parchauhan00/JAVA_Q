import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Hassing {
    public static void main(String[] args) {
        // Creation
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        //Search - contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Does not contain");
        }
        //Delet
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("We Deleted 1");
        }
        // Size
        System.out.println("Size is : "+ set.size());
        // print all elements
        System.out.println(set);
        // Iterator
        Iterator it = set.iterator();
        // next Function
        System.out.println(  it.next());
        System.out.println(  it.next());
       //  hasnext function
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
