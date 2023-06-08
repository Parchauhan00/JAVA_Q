import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int arr[],int key) {
        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid]<key) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,14,12,10};
        int k = 12;
        int keyFind = binarySearch(arr,k);
        if (keyFind == -1) {
            System.out.println("Key not Found");
        }
        else {
            System.out.println("key found at index :" + keyFind);
        }
    }
}
