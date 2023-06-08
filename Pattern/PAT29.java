// Hollowe Hill Pattern

public class PAT29 {
    public static void main(String[] args) {
        int n = 5;
        for (int i =1; i<=n;i++) {
            for (int j = 1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int k =1;k<=i;k++) {
               if (i==n ||k==1) {
                   System.out.print(" *");
               }
               else {
                   System.out.print(" ");
               }
            }
            for (int p = 1;p<=i;p++) {
                if (i ==n || p ==i) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
