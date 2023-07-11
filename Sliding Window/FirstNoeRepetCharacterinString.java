import java.util.*;

// First None Repeted Character in string

public class FirstNoeRepetCharacterinString {
    public static void main(String[] args) {
        String s = "aabbccedceijllko";

        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(int i =0;i<s.length();i++)  {
          if(hm.containsKey(s.charAt(i))) {
            hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
          } else{
            hm.put(s.charAt(i), 1);
          }
        }
        System.out.println(hm);

        for(int i =0;i<s.length();i++) {
          char ch = s.charAt(i);
          if(hm.containsKey(ch) && hm.get(ch)<2) {
            System.out.println(ch);
            break;
          }
        } 
    }
}
