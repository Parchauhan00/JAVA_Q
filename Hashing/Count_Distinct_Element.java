import java.util.Arrays;
import java.util.HashSet;

public class Count_Distinct_Element {

    public static void countDistinctElementArr(int arr[]) {

        int count =0;
        Arrays.sort(arr);

       for (int i = 0;i<arr.length;i++) {
           for (int j = 0;j<arr.length;j++) {
               if (arr[i]==arr[j]) {

               }
               else  {
                   arr[count++] = arr[i];
               }
           }
       }
       for (int i =0;i< count;i++) {
           System.out.println(arr[i]);
       }
        System.out.println(count);
    }

    public static void countNoHashset(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int k :arr) {
            hs.add(k);
        }
        System.out.println(hs.size());
    }

    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
     //  countDistinctElementArr(num);
       // System.out.println(count);

    countNoHashset(num);
    }
}
