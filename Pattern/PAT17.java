
// Number Pyramid
public class PAT17 {
    public static void main(String[] args) {
        int n =5;
        for (int i =1;i<=n ;i++) {
            // spaces
            for (int j =1;j<=n-i;j++) {
                System.out.print(" ");
            }
            // numbers print row noumber  row no times
            for (int k =1;k<=i;k++) {


                   System.out.print(i + " ");


            }
            System.out.println();

        }
    }
}
