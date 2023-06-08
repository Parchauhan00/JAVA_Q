public class Binary_Search {
    public static int bSearch(int arr[], int key) {
        int start = 0, end = arr.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (arr[mid]==key) {    // found
                return mid;
            }
            if (arr[mid]<key) {  // right
                start = mid+1;
            }
            else {
                end = mid-1;  // left
            }
        }
            return -1;   // exist nahi karta
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key =10;
        System.out.println("Index for Key is : " + bSearch(arr,key));
    }
}
