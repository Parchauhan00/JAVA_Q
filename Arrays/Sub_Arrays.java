public class Sub_Arrays {

    public static void subArray(int arr[]) {
        int maxSubSum = Integer.MIN_VALUE;
        int minSubSum = Integer.MAX_VALUE;
        int currSum = 0;
        for (int i = 0;i< arr.length;i++) {
            for (int j = i;j<arr.length;j++) {
                currSum = 0;
                for (int k = i;k<=j;k++) {
                    System.out.print(arr[k] + " ");
                    currSum =currSum+arr[k];
                }
                if (currSum>maxSubSum) {
                    maxSubSum = currSum;
                }
                if (currSum<minSubSum) {
                    minSubSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max :" + maxSubSum);
        System.out.println("Min :" + minSubSum);
    }
    public static void ppp(int currSum) {

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArray(arr);

    }
}
