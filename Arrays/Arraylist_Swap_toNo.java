import java.util.ArrayList;

public class Arraylist_Swap_toNo {

    public static int swap(ArrayList<Integer>list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(32);
        l1.add(23);
        l1.add(15);
        l1.add(13);

        int idx1 = 1, idx2 = 3;
        System.out.println(l1);
        swap(l1,idx1,idx2);
        System.out.println(l1);



    }
}
