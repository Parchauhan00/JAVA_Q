public class Sliding_Windows {

    public static void printkMax(int arr[], int n, int k) {
        int max ;

        for (int i = 0;i<n-k+1;i++) {
            max = arr[i];
            for (int j = 1; j<k;j++) {
                max = Math.max(arr[i + j], max);
            }
            System.out.println(max + " ");
        }
    }

    public static int maxSumSubarray(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += nums[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        //printkMax(arr, arr.length, k);
        System.out.println(maxSumSubarray(arr, k));
    }
}
