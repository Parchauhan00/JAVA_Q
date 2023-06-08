// reverse half pyramind ascend


public class PAT8 {
    public static void main(String[] args) {
        int n =15;
        int m =15;

        for (int i =1;i<=n;i++) {
            for (int j =1;j<i;j++){
                System.out.print(" ");

            }
            for (int k =m;k>=i;k--) {
                System.out.print("*");
            }
            System.out.println();
        }


        /////////////////////////////


        for (int i =1;i<=n;i++) {
            for (int j =1;j<i;j++){
                System.out.print(" ");

            }
            for (int k =m;k>=2;k--) {   /// put i instead of 2 to fix it
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
