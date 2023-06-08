import java.awt.font.FontRenderContext;

public class PAT10 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        for (int i =1;i<=n;i++) {
            for (int p =1;p<=n-i;p++) {
                System.out.print(" ");
            }
            for (int q =1;q<i;q++) {
                System.out.print(q);
            }
            for (int j =1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
