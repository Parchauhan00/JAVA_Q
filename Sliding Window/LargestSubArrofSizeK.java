
// Find largest Sub array of size k

public class LargestSubArrofSizeK {
   
    public static int longestSub(int arr[], int k) {
        int i = 0;
        int j = 0;
        int subSize = Integer.MIN_VALUE;
        int minsize = Integer.MAX_VALUE;
        int currSum = 0;

        while (j < arr.length) {
            currSum += arr[j];

            if (currSum < k) {
                j++;
            } else if (currSum == k) {
                int size = j - i + 1;
                subSize = Math.max(size, subSize);
                minsize = Math.min(size, minsize);
                j++;
            } else { // currSum > k
                while (currSum > k) {
                    currSum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(minsize);

        return subSize;
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 1, 1, 2, 3, 5};
        int longSubarraySize = longestSub(arr, 5);
        System.out.println(longSubarraySize);
    }
    
}
