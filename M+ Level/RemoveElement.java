public class RemoveElement {

        public static void removeElement(int[] nums,int val) {

            int output = 0;
            int index = 0;

            for(int i =0;i<nums.length;i++) {
                if(nums[i]!=val) {
                    nums[index] = nums[i];
                    index++;
                    output++;
                }
            }

            for (int i =0;i<output;i++) {
                System.out.println(nums[i]);
            }

        }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,2,10,2,16,34};
        int val = 2;
        removeElement(arr,val);
//        for (int i =0;i<arr.;i++) {
//            System.out.println(arr[i]);
//        }

    }
}
