import java.util.ArrayList;

public class ReverseArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(3);
        list.add(40);
        list.add(5);

             //  O(n)
      for (int i = list.size()-1;i>=0;i--) {
          System.out.print(list.get(i) + " ");
      }
        // Find maximum in Arraylist
         // O(n)  Linear time
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<list.size();i++) {
//            if (list.get(i)>max) {
//                max = list.get(i);
//            }
            max = Math.max(list.get(i),max);
        }
        System.out.println("Max Element is : " + max);
    }}
