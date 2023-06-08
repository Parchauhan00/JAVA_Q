public class PAT30 {       //            Hollow Full Pyramid Star Pattern with space

    public static void main(String[] args) {
        int n =6 ;
    for (int i =1;i<=n;i++) {
            for (int j = n-i;j>=1;j--) {
                System.out.print(" ");
            }
            for (int p =1;p<=i;p++) {
                if (i==1|| p==1|| i==n || p==i)  {
                    System.out.print("*"+ " ");
                }
                else {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }
    }
}
