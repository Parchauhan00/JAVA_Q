import java.util.*;
// First Negative Number in every Window of Size K 
public class FirstNegativeNoinwindo {

    public static void brutforce(int arr[], int k) {
       
        for(int i =0;i<arr.length-k+1;i++) {
             for(int j = i;j<i+k;j++) {
                if(arr[j]<0) {
                    System.out.print(arr[j]+ " ");
                    break;
                }
             }
        }
    }
           // Sliding Window
          public static void firstNegitiveNo(int arr[],int k) {
            LinkedList<Integer>list = new LinkedList<>();
                    int i =0;
                    int j =0;
                    while(j<arr.length-k+1) {
                        if(arr[j]<0) {
                            list.add(arr[j]);
                            
                        }
                        if(j-i+1<k) {  // Need to correction
                            j++;
                        }
                        if(j-i+1 == k) {
                               //list.add(arr[j]);
                           if(list.size() ==0) {
                                 System.out.println("0");
                           } else {
                                
                           }
                               i++;
                            j++;
                        }
                    } 
                    System.out.println(list);

                }
    public static void main(String[] args) {
        int arr[] = {12,-1,-7,8,-15,30,16,28};
       brutforce(arr, 3);
        firstNegitiveNo(arr, 3);
        
    }
    
}
