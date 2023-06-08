
// Print Palindromic Pattern

public class PAT18 {
    public static void main(String[] args) {
        int n =5;
        for (int i =1; i<=n;i++) {
           // Spaces
            for (int j =1;j<=n-i;j++) {
                System.out.print(" ");
            }

            // first half numbers
            for (int k = i; k>=1 ; k-- ) {
                System.out.print(k);
            }
            // second half numbers
            for (int p =2; p<=i;p++) {
                System.out.print(p);
            }
            System.out.println();

        }

        //////////////////////////////////////////////////

        for (int i =1; i<=n;i++) {
            // Spaces
            for (int j =1;j<=n-i;j++) {
                System.out.print(" ");
            }

            // first half numbers
            for (int k = i; k>=1 ; k-- ) {
                System.out.print(k);
            }
            // second half numbers
            for (int p =1; p<=i;p++) {     ///heare we took p = 1 that's why there are two middle rows of 1
                System.out.print(p);
            }
            System.out.println();

        }
    }
}
