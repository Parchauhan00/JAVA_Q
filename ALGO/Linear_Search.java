public class Linear_Search {

public static int  linearSearch(int arrr[], int key) {
    for (int i =0;i<arrr.length;i++) {
        if (arrr[i]==key) {
            return i;
        }
    }
return -1;
}
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int k = 10;
        int index = linearSearch(arr,k);
        if (index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key is found at index :" + index);
        }

    }
}
