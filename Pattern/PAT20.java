

// Dimond pattern second method
public class PAT20 {
    static public  void main(String[] args) {
        int n = 4;
        for (int i =1; i<=n ;i++) {
            // Spaces
            for (int j = 1; j<=n-i;j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k =1; k<= 2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();

        }
           ///////////// flip  the code
        for (int i =n; i>=1 ;i--) {
            // Spaces
            for (int j = 1; j<=n-i;j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k =1; k<= 2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
