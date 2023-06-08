import java.util.HashSet;

public class Union_intrsection_2arrays {
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr2[] = {6,3,9,6,2,4};

        HashSet<Integer> set = new HashSet<>();
      for (int k : arr) {
          set.add(k);
      }
      for (int p : arr2) {
          set.add(p);
      }
        System.out.println("Uninon is : " + set);

      set.clear();

      // Intersection

        for (int k : arr) {
            set.add(k);
        }

        int count =0;
        for (int k =0 ; k< arr2.length ; k++) {
            if (set.contains(arr2[k])) {
                count++;
                System.out.print(arr2[k] + " ");
            }
        }

    }
}
