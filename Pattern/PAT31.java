//

public class PAT31 {
    public static void main(String[] args) {
        int n =6;
        for (int i =1;i<=n;i++) {
            for (int j =0;j<=i/2;j++){
                System.out.print(" ");
            }
            for (int k =1;k<=n-i+1;k++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
