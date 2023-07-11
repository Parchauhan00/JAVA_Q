
// Longest SubString without repeting Character


import java.util.HashSet;

public class LongestSubStringWithoutRepeat {

    public static void longestSubstring(String s) {
        int i = 0;
        int j = 0;
        int longest = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                longest = Math.max(j - i, longest);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println("Longest Substring Size: " + longest);
    }

    public static void main(String[] args) {
        String s = "aabcdabdajklma";
        longestSubstring(s);
    }
}
