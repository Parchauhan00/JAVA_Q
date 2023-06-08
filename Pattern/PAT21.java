// Reverse Trangle print in downword
public class PAT21 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int p = 0;p<i/2;p++) {
                System.out.print(" ");
            }
            for (int k = n-i+1; k>= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
