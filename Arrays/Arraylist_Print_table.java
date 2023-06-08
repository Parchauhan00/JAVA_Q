import java.util.ArrayList;

public class Arraylist_Print_table {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> BaseList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4 = new ArrayList<>();
        ArrayList<Integer> l5 = new ArrayList<>();
        ArrayList<Integer> l6 = new ArrayList<>();
        ArrayList<Integer> l7 = new ArrayList<>();
        ArrayList<Integer> l8 = new ArrayList<>();
        ArrayList<Integer> l9 = new ArrayList<>();

        for (int i =1; i<=10;i++) {
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
            l4.add(i*4);
            l5.add(i*5);
            l6.add(i*6);
            l7.add(i*7);
            l8.add(i*8);
            l9.add(i*9);
        }
        BaseList.add(l1);BaseList.add(l2);BaseList.add(l3);BaseList.add(l4);BaseList.add(l5);BaseList.add(l6);BaseList.add(l7);BaseList.add(l8);BaseList.add(l9);
        System.out.println(BaseList);

        l3.remove(5);

        for (int i =0;i<BaseList.size();i++) {
            ArrayList<Integer> tempList = BaseList.get(i);
            for (int j = 0;j<tempList.size();j++) {
                System.out.print(tempList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
