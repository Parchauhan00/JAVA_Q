public class Reverse_Array_II {

    public static void revArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp;
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        revArray(arr);

    }
}
