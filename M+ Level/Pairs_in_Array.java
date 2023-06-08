public class Pairs_in_Array {

    public static void pairsOfArray (int arr[]) {

        for (int i =0; i<arr.length;i++) {
            for (int k =i+1;k< arr.length;k++) {
                System.out.print("(" + arr[i] + "," + arr[k] + ")");
            }
            System.out.println();
        }
    }

    public static void printSubArray(int arr[]) {
        int totalsubArray =0;
        for (int i =0;i< arr.length;i++ ) {
            for (int j = i;j<arr.length;j++) {

                for(int start = i;start<=j ; start++) {
                    System.out.print(arr[start] + " ");
                }
                totalsubArray++;
                System.out.println();
            }
        }
        System.out.println("Total sub array" + totalsubArray );
    }


    public static void printMaxsubarraysum(int arr[]) {

        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
      for (int i =0;i<arr.length;i++) {
          int start = i;
          for (int j =i ; j<arr.length; j++) {
              int end = j;
              currSum = 0;
              for (int k = start; k<=end; k++) {
                  currSum += arr[k];

              }
              System.out.println(currSum);
              if (maxSum< currSum) {
                  maxSum = currSum;
              }
          }
      }
        System.out.println("Max sum is " + maxSum);
    }

    public static int KadanseAlgo(int number[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i =0;i< number.length;i++) {
            currSum = currSum+number[i];
            if (currSum<0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
      return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
       // pairsOfArray(arr);

     //   printSubArray(arr);

      //  printMaxsubarraysum(arr);

        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println( KadanseAlgo(number));
    }
}
