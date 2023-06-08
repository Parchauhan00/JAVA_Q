public class BubbleShrt {
    public static void main(String[] args) {
        int arr[] = {7,8,23,12,18,32,10};

        for (int i =0;i< arr.length-1;i++) {
            for (int j =0;j< arr.length-i-1;j++) {
                int temp ;
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        BubbleShrt b = new BubbleShrt();
        b.printArray(arr);
    }
    public void printArray(int arr[]) {
        for (int i =0;i< arr.length;i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
