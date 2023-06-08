//Print half pyramind ascend
public class PAT6 {
    public static void main(String[] args) {
         int n =4;
       //  int m =4;
         for (int i =1;i<=n;i++) {
             for (int j = 1;j<=n-i;j++) {
                 System.out.print(" ");
             }
                 for (int k =1;k<=i;k++) {
                     System.out.print("*");   // If we put ("*"+ " ") then it wil make Hill


             }
             System.out.println();
         }
    }
}
