
// Butterfly Pattern
public class PAT14 {
    public static void main(String[] args) {
        int n =5;
        int m =5;

        // Upper half
        for (int i =1;i<=n;i++) {
            // 1st part
            for (int j = 1 ;j<=i;j++) {
                System.out.print("*");
            }
               // Spaces
                for (int k =1;k<=2*(n-i);k++) {
                    System.out.print(" ");
                }

                // 2nd part
                for (int p = 1;p<=i;p++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        // Lower Half

        for (int i =n ; i>=1;i--) {
            // 1st part
            for (int j = 1 ;j<=i;j++) {
                System.out.print("*");
            }
            // Spaces
            for (int k =1;k<=2*(n-i);k++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int p = 1;p<=i;p++) {
                System.out.print("*");
            }

            System.out.println();
        }


        }
    }

