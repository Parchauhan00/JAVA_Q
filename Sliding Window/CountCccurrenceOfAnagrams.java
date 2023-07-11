public class CountCccurrenceOfAnagrams {

public static int countOccurrrences(String s1, String s2) {
    int i =0;
    int j =0;
     int occurence = 0;
     int k = s2.length();
     String temp = "";
     StringBuilder sb = new StringBuilder();
     while(j<s1.length()) {
         sb.append(s1.charAt(j));
        if(j-1+1<k) {
            j++;
        } else if(j-i+1 == k) {
                if(sb.equals(s2)) {
                    occurence++;
                    j++;
                } else{
                    sb.remove(i);
                }
               
        }
     }
}

    public static void main(String[] args) {
        
    }
    
}
