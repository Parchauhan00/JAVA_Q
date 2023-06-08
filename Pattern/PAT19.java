
// Diamont Pattern

public class PAT19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first part Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // second part stars
            for (int p = 2; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /// Lower half

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first part stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // second part stars
            for (int p = 2; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}