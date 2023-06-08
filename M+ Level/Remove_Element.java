public class Remove_Element {


        public static int removeElement(int[] nums, int val) {
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=val)
                {
                    nums[count]=nums[i];
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        int arr[] = {17,2,4,6,10,42,55,2,13};
        int val =2;
        removeElement(arr,val);
        for (int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }


    }
}
