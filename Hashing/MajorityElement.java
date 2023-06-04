import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MajorityElement{
    public static void main(String[] args) {

        int nums[] = {1,3,2,5,1,3,1,5,1,3,};
        
HashMap<Integer,Integer> hm = new HashMap<>();


        for(int i =0;i<nums.length;i++) {

        
            // if(hm.containsKey(nums[i]) ) {
            //     hm.put(num[i],hm.get(num[i])+1);
            // }            
            // else {
            //     hm.put(num[i],1);
            // }


            Map.put(nums[i], hm.getOrDefault(nums[i], defaultValue ,0) + 1);
        }

        
        for(Integer key : hm.keySet()) {

            if(hm.get(key)> nums.length/3) {
                System.out.println(key);
            }
        }

    }
}