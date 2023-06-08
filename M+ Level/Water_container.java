import java.util.ArrayList;

public class Water_container {
// two pointer approch
public static int MostWater(ArrayList<Integer>height) {
    int maxWater = 0;
    int leftPonter = 0;
    int rightPointer = height.size()-1;
    while (leftPonter<rightPointer) {
        int minHeight = Math.min(height.get(leftPonter), height.get(rightPointer));
        int width = rightPointer-leftPonter;
        int currWater = minHeight*width;
        maxWater = Math.max(maxWater, currWater);

        // update ptr
        if (height.get(leftPonter)<height.get(rightPointer)) {
            leftPonter++;
        }
        else {
            rightPointer--;
        }
      /// Time complexity O(n)
    }
return maxWater;
}

    public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();

    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
        System.out.println(MostWater(list));

    }
}
