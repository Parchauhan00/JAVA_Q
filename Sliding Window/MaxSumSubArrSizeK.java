
// Maximum sum subArray of size K
public class MaxSumSubArrSizeK { 

    // Brut Force 
    public static int brutForce(int arr[], int k) {
           int currsum = 0;
           int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length-k+1;i++) {
            currsum = 0;
            for(int j =i;j<i+k;j++) {
                currsum +=arr[j];
            }
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }
    
    
    // By Sliding Windo Approch

    public static int maxSubArray(int arr[],int k) {
            int i = 0;//start
            int j =0; // end
            int sum =0;
            int maxSum = Integer.MIN_VALUE;
            while(j<arr.length) {
              sum +=arr[j];
              if(j-i+1<k) {
                j++;
              }else if(j-i+1 ==k) {
                maxSum = Math.max(sum, maxSum);
                sum = sum-arr[i];
                i++;
                j++;
              }
            }
            return maxSum;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,4,3};
        int sumBrutforce = brutForce(arr, 4);
      System.out.println("Brutforce  " +sumBrutforce);
      int sum = maxSubArray(arr, 4);
      System.out.println("Sliding window  " +sum);
      
      
    }
}
