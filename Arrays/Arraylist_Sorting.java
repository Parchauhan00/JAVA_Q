import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(21);
        l1.add(12);
        l1.add(14);
        l1.add(16);
        l1.add(5);

        System.out.println(l1);
        Collections.sort(l1);          // ascending order
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
