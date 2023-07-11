
// Longest SubArray Without Repeting SubArray

import java.util.HashSet;

public class LongestSubArrWithoutRepNo {
    public static int subArray(int arr[]) {
        int i = 0;
        int j = 0;
        int longestSubArr = 0;
        HashSet<Integer> set = new HashSet<>();
        while (j < arr.length) {
            if (!set.contains(arr[j])) {
                set.add(arr[j]);
                longestSubArr = Math.max(longestSubArr, j - i + 1);
                j++;
            } else {
                set.remove(arr[i]);
                i++;
            }
        }
        return longestSubArr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 4, 2, 7, 8, 6, 2};
        System.out.println("Longest Subarray Size: " + subArray(arr));
    }
}
