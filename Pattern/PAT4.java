
// print holow rectangle


public class PAT4 {
    public static void main(String[] args) {
        int m =5;
        int n =5;

        //outer loop
        for(int i =1;i<=n ;i++) {
             for(int j = 0;j<=m;j++) {
                 if (i == 1 || j == 1 ||i == n || j == m) {
                     System.out.print("*");

                 }
                 else {
                     System.out.print(" ");
                 }
             }
            System.out.println();
        }

    }
}
