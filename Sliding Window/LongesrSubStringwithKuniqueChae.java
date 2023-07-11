import java.util.HashMap;
      // Find Longest SubString with K Unique Character
public class LongesrSubStringwithKuniqueChae {
    public static int subString(String s , int uniqueChar ) {
        HashMap<Character,Integer> hm = new HashMap<>();

           int i =0;
           int j =0;
           int maxsubsize = Integer.MIN_VALUE;
             while(j<s.length()) {
             
                if(hm.containsKey(s.charAt(j))) {
                    hm.put(s.charAt(j),hm.get(s.charAt(j))+1);
                } else {
                    hm.put(s.charAt(j),1);
                }
                if(hm.size()<uniqueChar) {
                 //  j++;
                } else if(hm.size() == uniqueChar) {
                    maxsubsize = Math.max(maxsubsize,j-i+1);
                  //  j++;
                } else if(hm.size()>uniqueChar) {
                    while(hm.size()>uniqueChar) {
                        hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                        if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))==0) {
                            hm.remove(s.charAt(i));
                        }
                        i++;    
                    }  
                }
                j++;
             }
        return maxsubsize;

    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        System.out.println(subString(s, 3));
    }
}
