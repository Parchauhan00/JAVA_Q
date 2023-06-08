public class Trapping_rainWater {

    public static int trapRainWater(int height[]) {   // O(n)
     // calculate left max boundary
     int leftmax[] = new int[height.length];
     leftmax[0] = height[0];
     for (int i =1;i< height.length;i++) {
         leftmax[i] = Math.max(height[i],leftmax[i-1]);
     }
     // calculate right max boundary
        int rightMax[] = new int[height.length];
          rightMax[height.length-1] = height[height.length-1];
          for (int j =height.length-2; j>=0;j--) {
              rightMax[j] = Math.max(height[j],rightMax[j+1] );
          }
          // Loop
        int trappedWater =0;
        for (int i =0;i< height.length;i++) {
            // Waterlevel = min(leftmax bound , rightmaxBound)
            int waterlavel = Math.min(leftmax[i],rightMax[i] );
            // trapped water = waterlevel - height[i]
            trappedWater += waterlavel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
       int arr[] = {4,2,0,6,3,2,5};
       trapRainWater(arr);
        System.out.println(trapRainWater(arr));
    }
}
