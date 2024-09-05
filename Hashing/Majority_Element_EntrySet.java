import java.util.HashMap;
import java.util.Map;

public class Majority_Element {

    public static void main(String[] args) {
        int arr[] = {2,5,7,1,5,2,9,8,1,10};

        HashMap<Integer,Integer>hm = new HashMap();

        for (int i = 0;i<arr.length;i++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1 );
            } else {
                hm.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer>map : hm.entrySet()){
            if (map.getValue()>1) {
                System.out.println(map.getKey());
            }

        }


    }

}
